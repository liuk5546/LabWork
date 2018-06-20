package com.zucc.edu.dao.impl;

import com.zucc.edu.dao.iface.IComputerDAO;
import com.zucc.edu.entity.ComputersEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ComputerDAO implements IComputerDAO{
    @Resource(name = "sessionFactory")
    private SessionFactory sf;
    public boolean add(ComputersEntity newComputer) {
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(newComputer);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public boolean delete(int id) {
        return false;
    }

    public boolean modify(ComputersEntity oldComputer, ComputersEntity newComputers) {
        return false;
    }

    public ComputersEntity find(int id) {
        return null;
    }

    public List<ComputersEntity> findByLabId(int labid) {
        List<ComputersEntity> res;
        Session session = sf.openSession();
        session.beginTransaction();
        String hql = "from ComputersEntity where fkIdLab = ?";
        Query query = session.createQuery(hql);
        query.setParameter(0,labid);
        res = query.list();
        session.getTransaction().commit();
        session.close();
        return res;
    }

}
