/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.veritabani_simulasyon;

import entities.concrete.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kaan
 */
public class UserTable {

    private static List<User> users;

    public static List<User> getUsers() {

        if (users == null) {
            users = new ArrayList<User>();
        }

        return users;
    }

}
