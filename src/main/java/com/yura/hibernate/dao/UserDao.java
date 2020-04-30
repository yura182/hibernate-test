package com.yura.hibernate.dao;

import com.yura.hibernate.entity.User;
import com.yura.hibernate.factory.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao {

    public void save(User user) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public User findById(Integer id) {
        return HibernateSessionFactory.getSessionFactory().openSession().get(User.class, id);
    }
}
