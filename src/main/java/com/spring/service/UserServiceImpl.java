package com.spring.service;

import com.spring.dao.UserDao;
import com.spring.dao.UserDaoImpl;
import com.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {


    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;

    }

    public void addUser(User user) {

        userDao.addUser(user);
    }


    public void updateUser(User user) {

        userDao.updateUser(user);
    }


    public void deleteUser(Long id) {
        userDao.deletUser(id);
    }


    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }


    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
