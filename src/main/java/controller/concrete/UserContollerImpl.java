/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.concrete;

import controller.abstracts.UserController;
import data_access.abstracts.UserDao;
import entities.concrete.User;
import java.util.List;

/**
 *
 * @author kaan
 */
public class UserContollerImpl implements UserController {

    private UserDao userDao;

    public UserContollerImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    public void insert(List<User> users) {
        userDao.insert(users);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public void delete(List<User> users) {
        userDao.delete(users);
    }

    @Override
    public void update(User user, int id) {
        userDao.update(user, id);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public boolean isRegistered(User user) {
        return userDao.isRegistered(user);
    }

    @Override
    public User registerWith() {
        return userDao.registerWith();
    }

}
