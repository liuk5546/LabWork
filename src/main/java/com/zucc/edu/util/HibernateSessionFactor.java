package com.zucc.edu.util;

import com.zucc.edu.entity.LabsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateSessionFactor {
    private SessionFactory sessionFactory;
    //private static Configuration config = new Configuration().configure();

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void main(String[] args) {

        Configuration config = new Configuration().configure(); // Hibernate框架加载hibernate.cfg.xml文件
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        LabsEntity labsEntity = new LabsEntity();
        labsEntity.setIdLab(1);
        labsEntity.setNameLab("test");
        labsEntity.setPostionLab("LI4");
        labsEntity.setDescriptionLab("test");
        labsEntity.setGetWayLab("10.21.10.1");
        session.save(labsEntity);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
