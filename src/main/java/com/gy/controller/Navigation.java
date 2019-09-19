package com.gy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName Navigation
 * @Author gaoyang
 * @Date 2019/9/1914:37
 * @Version 1.0
 **/
@Controller
public class Navigation {
    @RequestMapping("/test")
    public ModelAndView test(){
        System.out.println("ffff");
        ModelAndView mav = new ModelAndView("ok");
        mav.addObject("text","我是导航");
        return mav;
    }
}
