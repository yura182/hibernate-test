package com.yura.hibernate.factory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryWrapper {
    public static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("HibernateTest");
}
