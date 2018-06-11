package com.zucc.edu.controller;

import com.zucc.edu.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(path = "/labs")
public class LabController {
    @Resource
    LabService labService;

    @RequestMapping("/getAll")
    public String getAll(Model model){
        model.addAttribute("list", labService.allLabs());
        return "Labs/getAll";
    }
}
