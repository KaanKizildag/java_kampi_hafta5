/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_access.concrete;

import data_access.abstracts.RegisterService;
import entities.concrete.User;

/**
 *
 * @author kaan
 */
public class RegisterServiceImpl implements RegisterService{

    @Override
    public User register() {
        System.out.println("Google ile giriş yapıldı");
        return new User(1, "Kaan", "kaan@gmail.com", 21);
    }

    
}
