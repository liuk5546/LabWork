package com.zucc.edu.service;

import com.zucc.edu.dao.iface.ILabDAO;
import com.zucc.edu.entity.LabsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LabService {
    @Autowired
    ILabDAO labDAO;
    public List<LabsEntity> allLabs(){
        return labDAO.getAll();
    }

    public boolean modifyLab(LabsEntity lab){
        if(labDAO.getById(lab.getIdLab())==null){
            System.out.println("lab不存在");
            return false;
        }else {
            labDAO.modify(lab);
            return true;
        }
    }
    public boolean addLab(LabsEntity labsEntity){
        labDAO.add(labsEntity);
        return true;
    }
}
