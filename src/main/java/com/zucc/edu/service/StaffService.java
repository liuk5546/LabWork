package com.zucc.edu.service;

import com.zucc.edu.dao.iface.IStaffDAO;
import com.zucc.edu.entity.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffService {
    @Autowired//自动注入
    IStaffDAO staffDAO;

    public List<Staff> queryAllUSers(){
        System.out.println(staffDAO.getAll().get(0).getPasswordStaff());
        return staffDAO.getAll();
    }

    public boolean register(Staff staff){
        return staffDAO.add(staff);
    }

    public Staff login(Staff requestStaff){
        Staff realStaff =  staffDAO.getStaffById(requestStaff.getIdStaff());
        if(realStaff == null||!realStaff.equals(realStaff)){
            realStaff = new Staff();
            realStaff.setIdStaff(-1);
            realStaff.setPasswordStaff(null);
        }
        return realStaff;
    }



    public boolean deleteStff(int id){
        return staffDAO.delete(id);
    }

    public boolean edit(Staff staff){
        return staffDAO.update(staff);
    }
}
