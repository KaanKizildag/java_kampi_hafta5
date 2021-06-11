/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_access.abstracts;

import entities.concrete.User;

/**
 *
 * @author kaan
 */
public interface RegisterService {

    // herhangi bir parametre almasın
    // bir sağlayıcıdan kullanıcı bilgileri dönsün
    User register();

}
