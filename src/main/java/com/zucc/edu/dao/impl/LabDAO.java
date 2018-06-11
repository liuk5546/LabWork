package com.zucc.edu.dao.impl;

import com.zucc.edu.dao.iface.ILabDAO;
import com.zucc.edu.entity.LabsEntity;
//import org.springframework.beans.factory.HierarchicalBeanFactory;
import com.zucc.edu.util.HibernateSessionFactor;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository
public class LabDAO implements ILabDAO {
    @Resource(name = "sessionFactory")
    private SessionFactory sf;
    public List<LabsEntity> getAll() {
        Session session = sf.openSession();
        session.beginTransaction();
        String hql = "from LabsEntity ";
        Query query = session.createQuery(hql);
        List<LabsEntity> list = query.list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

//    public SessionFactory getSf() {
//        return sf;
//    }
//
//    public void setSf(SessionFactory sf) {
//        this.sf = sf;
//    }

    public static void main(String[] args) {
        LabDAO dao = new LabDAO();
        System.out.print(dao.getAll().get(0).getNameLab());
    }
}
