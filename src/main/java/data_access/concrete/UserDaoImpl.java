/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_access.concrete;

import core.email_validation.SimpleEmailValidation;
import core.veritabani_simulasyon.UserTable;
import data_access.abstracts.RegisterService;
import data_access.abstracts.UserDao;
import entities.concrete.User;
import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kaan
 */
// RAM veri tabanı olsun
public class UserDaoImpl implements UserDao {

    private RegisterService registerService;

    public UserDaoImpl(RegisterService registerService) {
        this.registerService = registerService;
    }

    @Override
    public void insert(User user) {
        // Veri tabanında olması gereken işlemlerin tamamı burada olduğu için spagetti oldu =)
        if(!new SimpleEmailValidation().validateEmailAddress(user.getEmail())){
            System.out.println("\nGeçersiz mail adresi\n");
            return;
        }
        
        // herhangi bir email eşleşmesi bulursa ekleme yapamayacak
        if (UserTable.getUsers().stream().anyMatch((u) -> {
            System.out.println("e mail sorgusu");
            return user.getEmail().equals(u.getEmail()); //To change body of generated lambdas, choose Tools | Templates.
        })) {
            System.out.println("Bu mail daha önce alınmış");
            return;
        }
        
        UserTable.getUsers().add(user);
        System.out.println("Kullanıcı RAM veritabanına eklendi\n" + user);
        System.out.println(user.getEmail() + " Adresine mail atıldı.\n");
    }

    @Override
    public void delete(User user) {
        UserTable.getUsers().remove(user);
        System.out.println("Kullanıcı RAM veritabanından silindi\n" + user);
    }

    @Override
    public void update(User user, int id) {
        System.out.println("Kullanıcı RAM veritabanında güncellendi\n" + user);
    }

    @Override
    public List<User> getAll() {
        return UserTable.getUsers();
    }

    @Override
    public void insert(List<User> users) {
        for (User user : users) {
            this.insert(user);
        }
    }

    @Override
    public void delete(List<User> users) {
        for (User user : users) {
            this.delete(user);
        }
    }

    @Override
    public boolean isRegistered(User user) {
        // Şunu gerçekten veri tabanından çeksem ne güzel olurdu =( 
        // Muhtemelen referansları tutmayacak ve sistem çalışmayacak. (?) 
        // equals metodunu override ederek ıd üzerinden sorgu atmasını sağladım.
        return UserTable.getUsers().contains(user);
    }

    @Override
    public User registerWith() {
        User tmp = registerService.register();
        insert(tmp);
        return tmp;
    }
}
