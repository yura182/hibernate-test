package com.yura.hibernate.dao;

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
        User user = new User("Yura", "yura@gmail.com", "123456");
        userDao.save(user);
    }

    @Test
    public void findById_shouldReturnUser() {
        System.out.println(userDao.findById(1));
    }
}