/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.abstracts;

import entities.concrete.User;
import java.util.List;

/**
 *
 * @author kaan
 */
public interface UserController {

    void insert(User user);

    void insert(List<User> users);

    void delete(User user);

    void delete(List<User> users);

    void update(User user, int id);

    List<User> getAll();

    boolean isRegistered(User user);

    public User registerWith();

}
