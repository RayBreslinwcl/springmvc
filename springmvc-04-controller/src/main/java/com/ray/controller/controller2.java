package com.ray.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 注解开发
 */
@Controller
public class controller2 {

    @RequestMapping("/t2")
    public String index(Model model){

        model.addAttribute("msg","annotation Controller");
        return "test";
    }
}
