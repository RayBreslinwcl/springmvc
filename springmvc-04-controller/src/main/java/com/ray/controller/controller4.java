package com.ray.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * restful风格
 */
@Controller
public class controller4 {

    /**
     * 最初：http://localhost:8080/springmvc_04_controller_war_exploded/add?a=1&b=2
     * 结果：3
     * @param a
     * @param b
     * @param model
     * @return
     */
    @RequestMapping("/add")
    public String test1(int a, int b, Model model){

        int res=a+b;
        model.addAttribute("msg",res);

        return "test";
    }

    /**
     * Restful风格
     * 请求：http://localhost:8080/springmvc_04_controller_war_exploded/add/1/2
     * 结果：3
     * @param a
     * @param b
     * @param model
     * @return
     */
    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.POST)
    public String test2(@PathVariable int a,@PathVariable int b, Model model){

        int res=a+b;
        model.addAttribute("msg",res);

        return "test";
    }

}
