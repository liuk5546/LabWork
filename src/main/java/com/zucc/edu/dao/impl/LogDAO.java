package com.zucc.edu.dao.impl;

import com.zucc.edu.dao.iface.ILogDAO;
import com.zucc.edu.entity.LogsEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Repository
public class LogDAO implements ILogDAO{
    @Resource(name = "sessionFactory")
    private SessionFactory sf;
    public boolean add(LogsEntity log) {
        return false;
    }

    public boolean delete(int id) {
        return false;
    }

    public boolean modify(int id, Date endDate) {
        return false;
    }

    public List<LogsEntity> findByUserId(int userid) {
        List<LogsEntity>res;
        Session session = sf.openSession();
        session.beginTransaction();
        String hql = "from LogsEntity where fkIdStaff = ?";
        Query query = session.createQuery(hql);
        query.setParameter(0,userid);
        res = query.list();
        session.getTransaction().commit();
        session.close();
        return res;
    }
}
