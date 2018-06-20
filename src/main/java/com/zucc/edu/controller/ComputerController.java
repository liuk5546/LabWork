package com.zucc.edu.controller;

import com.zucc.edu.entity.ComputersEntity;
import com.zucc.edu.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/computers")
public class ComputerController {
    @Autowired
    ComputerService computerService;
    //获取实验室的电脑
    @RequestMapping("/info/{labid}")
    public String labsinfo(@PathVariable int labid,Model model){
        List<ComputersEntity> computers = computerService.LabsComputer(labid);
        model.addAttribute("computers", computers);
        model.addAttribute("num",labid);
        return "Computer/index";
    }
    @RequestMapping("/add/{labid}")
    public String addComputer(@PathVariable int labid,ComputersEntity computersEntity){
        //System.out.println("增加"+computersEntity.getIdComputers());
        computersEntity.setFkIdLab(labid);
        computerService.addComputer(computersEntity);
        return "redirect:/computers/info/"+labid;
    }
}
