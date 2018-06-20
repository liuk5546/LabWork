package com.zucc.edu.controller;

import com.zucc.edu.entity.LabsEntity;
import com.zucc.edu.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.annotation.Resource;
import java.util.List;

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
    @RequestMapping("/addOne")
    public String addOne(LabsEntity labsEntity){
        labService.addLab(labsEntity);
        return "redirect:/labs/getAll";
    }
    @RequestMapping("/json/getAll")
    @ResponseBody
    public ModelAndView getAll(){
        List<LabsEntity> labs = labService.allLabs();
        ModelAndView mav = new ModelAndView(new MappingJackson2JsonView());
        mav.addObject(labs);
        return mav;
    }
}
