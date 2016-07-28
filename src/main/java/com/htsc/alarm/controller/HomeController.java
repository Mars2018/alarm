package com.htsc.alarm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mars_wang on 2016/7/27.
 */
@Controller
public class HomeController {


    @RequestMapping(value = "/{page}")
    public String welcome(@PathVariable("page") String page){
        if(null == page || "".equals(page))
            return "index";
        else
            return page;
    }


}
