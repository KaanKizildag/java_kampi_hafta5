
import controller.abstracts.UserController;
import controller.concrete.UserContollerImpl;
import data_access.concrete.RegisterServiceImpl;
import data_access.concrete.UserDaoImpl;
import entities.concrete.User;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaan
 */
public class Main {
    public static void main(String[] args) {
        
        UserController userController = new UserContollerImpl(new UserDaoImpl(new RegisterServiceImpl()));
        
        User user = new User(0, "Hüseyin Kaan", "huseyin@gmail.com", 21);
        
        System.out.println("Kayıtlı mı: " + userController.isRegistered(user) + "\n");
        
        // Hızlıca list oluşturmak için List.of kullanıyorum.
        // İki kullanıcıyı eklemeye çalıştığım zaman bu mail alınmış mesajı görüyorum.
        userController.insert(List.of(user, user));
        
        System.out.println("\nKayıtlı mı: " + userController.isRegistered(user) + "\n");
        
        userController.delete(user);
        
        System.out.println("\nKayıtlı mı: " + userController.isRegistered(user));
        
        User googleUser = userController.registerWith();
        
        System.out.println("\nKayıtlı mı: " + userController.isRegistered(googleUser));
        
        
        // Email Doğrulama
        User gecersizUser = new User(14, "Sevmediğim bir isim", "kabulEdilmeyecek bir mail.com", 56);
        
        userController.insert(gecersizUser);
        
    }
}
