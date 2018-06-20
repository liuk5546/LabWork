package com.zucc.edu.controller;

import com.zucc.edu.entity.Staff;
import com.zucc.edu.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/staff")
public class StaffController {
    @Autowired
    StaffService staffService;

    @RequestMapping(path = "/index")
    public String index(Model model){
        model.addAttribute("list",staffService.queryAllUSers());
        return "Staff/index";
    }
    @RequestMapping(path = "/delete/{id}")
    public String delete(@PathVariable int id){
        staffService.deleteStff(id);
        return "redirect:/staff/index";
    }
    @RequestMapping("/addOne")
    public String addOne(Staff staff){
        staffService.register(staff);
        return "redirect:/staff/index";
    }

    @RequestMapping("/login")
    public String login(Staff staff,Model model){
        System.out.println(staff.getIdStaff()+" "+staff.getPasswordStaff());
        Staff realStaff = staffService.login(staff);
        if(realStaff.getIdStaff() == -1){
            return "redirect:/error/permit";
        }else{
            model.addAttribute("staff",realStaff);
            if(realStaff.getPositionStaff().equals("管理员")){
                model.addAttribute("model","管理员主页");
                return "Staff/manager";
            }else{
                model.addAttribute("model","学生主页");
                return "Staff/student";
            }
            //return "Staff/main";
        }
    }

}
