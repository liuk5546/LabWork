package com.zucc.edu.dao.iface;

import com.zucc.edu.entity.ComputersEntity;
import com.zucc.edu.entity.LogsEntity;

import java.util.Date;
import java.util.List;

public interface ILogDAO {
    boolean add(LogsEntity log);
    boolean delete(int id);
    boolean modify(int id , Date endDate);
    List<LogsEntity> findByUserId(int userid);
    //List<LogsEntity> findAll();
}
