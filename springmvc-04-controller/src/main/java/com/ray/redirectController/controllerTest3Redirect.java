package com.ray.redirectController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controllerTest3Redirect {
   @RequestMapping("/rsm2/t1")
   public String test1(Model model){
//       Model mv=model;
       model.addAttribute("msg","转发");
       //转发
       return "test";
  }

   @RequestMapping("/rsm2/t2")
   public String test2(){
       //重定向
       return "redirect:/index.jsp";
       //return "redirect:hello.do"; //hello.do为另一个请求/
  }

}
