package com.gy.controller;

import cn.hutool.json.JSONUtil;
import com.gy.pojo.Navigation;
import com.gy.service.NavigationService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Navigation
 * @Author gaoyang
 * @Date 2019/9/1914:37
 * @Version 1.0
 **/
@RestController
public class NavigationController {
    @Autowired
    private NavigationService navigationService;
    @RequestMapping("/loadNavigation")
    public String loadNavigation(){
        List<Navigation> rootNavigation = navigationService.queryRootNavigation();
        List<Navigation> firstNavigation = new ArrayList<>();
        for(int i = 0; i < rootNavigation.size(); i++){
            if(StringUtils.isBlank(rootNavigation.get(i).getParentId())){
                firstNavigation.add(rootNavigation.get(i));
            }
        }
        for(Navigation n : firstNavigation){
            n.setChildNav(getChild(n.getId(),rootNavigation));
        }
        return JSONUtil.toJsonStr(firstNavigation);
    }

    private List<Navigation> getChild(Integer id, List<Navigation> rootNavigation){
        String ids = id.toString();
        List<Navigation> secondNavigation = new ArrayList<>();
        for(Navigation n : rootNavigation){
            if(StringUtils.isNotBlank(n.getParentId())){
                if(n.getParentId().equals(ids)){
                    secondNavigation.add(n);
                }
            }
        }
        if(secondNavigation.size() == 0){
            return null;
        }
        return secondNavigation;
    }
}
