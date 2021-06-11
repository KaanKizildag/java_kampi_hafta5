/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.concrete;

import entities.abstracts.Entity;

/**
 *
 * @author kaan
 */
public class User implements Entity {

    private int id;
    private String name;
    private String email;
    private String password;
    private int age;

    public User() {

    }

    public User(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = name.repeat(3); // mermermerve =) 
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format(
                "Kullanıcı adı: %s\n"
                + "E-posta adresi: %s\n"
                + "Yaşı: %d",
                this.name, this.email, this.age);
    }

    @Override
    public boolean equals(Object obj) {
        User tmp = (User) obj;
        return this.id == tmp.getId();
    }
    
    

}
