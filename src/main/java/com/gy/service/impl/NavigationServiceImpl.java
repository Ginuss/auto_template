package com.gy.service.impl;

import com.gy.mapper.NavigationMapper;
import com.gy.pojo.Navigation;
import com.gy.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName NavigationServiceImpl
 * @Author gaoyang
 * @Date 2019/9/2117:25
 * @Version 1.0
 **/
@Service
public class NavigationServiceImpl implements NavigationService {
    @Autowired
    private NavigationMapper navigationMapper;

    @Override
    public List<Navigation> queryRootNavigation() {
        return navigationMapper.queryRootNavigation();
    }
}
