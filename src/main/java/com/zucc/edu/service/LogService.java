package com.zucc.edu.service;

import com.zucc.edu.dao.iface.ILogDAO;
import com.zucc.edu.entity.LogsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {
    @Autowired
    ILogDAO logDAO;
    //获取某个人的浏览记录
    public List<LogsEntity> staffLog(int id){
        return logDAO.findByUserId(id);
    }
}
