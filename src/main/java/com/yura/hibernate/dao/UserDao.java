package com.yura.hibernate.dao;

import com.yura.hibernate.entity.User;
import com.yura.hibernate.factory.EntityManagerFactoryWrapper;
import com.yura.hibernate.factory.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UserDao {

    public void save(User user) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public void saveJpa(User user) {
        EntityManager entityManager = EntityManagerFactoryWrapper.emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(user);
        transaction.commit();
        entityManager.close();
    }

    public User findById(Integer id) {
        return HibernateSessionFactory.getSessionFactory().openSession().get(User.class, id);
    }

    public User findByIdJpa(Integer id) {
        EntityManager entityManager = EntityManagerFactoryWrapper.emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        User user = entityManager.find(User.class, id);
        transaction.commit();
        entityManager.close();

        return user;
    }
}
