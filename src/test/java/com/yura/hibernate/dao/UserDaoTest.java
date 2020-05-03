package com.yura.hibernate.dao;

import com.yura.hibernate.entity.Address;
import com.yura.hibernate.entity.User;
import org.junit.Before;
import org.junit.Test;

public class UserDaoTest {

    private UserDao userDao;

    @Before
    public void setUp() {
        userDao = new UserDao();
    }

    @Test
    public void save_ShouldSaveUser() {
        Address address = new Address("Green", 2);
        User user = new User("Yura", "yura@gmail.com", "123456", address);
        userDao.save(user);
    }

    @Test
    public void findById_shouldReturnUser() {
        System.out.println(userDao.findById(1));
    }

    @Test
    public void save_ShouldSaveUserJpa() {
        Address address = new Address("Green", 2);
        User user = new User("Jpa", "jpa@gmail.com", "12345", address);
        userDao.saveJpa(user);
    }

    @Test
    public void findById_ShouldReturnUserJpa() {
        System.out.println(userDao.findByIdJpa(1));
    }
}