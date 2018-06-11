package com.zucc.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//声明为控制器
@RequestMapping(path = "/error") //请求映射
public class WellcomePageController {
    @RequestMapping(path = "/permit")
    public String index(Model model){
        model.addAttribute("message","密码或用户名错误");
        return "index";
    }
}
