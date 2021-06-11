/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.email_validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kaan
 */
public class SimpleEmailValidation implements EmailValidation {

    private static Pattern EMAIL_REGEX = Pattern.compile("^(.+)@(.+)$");

    /**
     * A simple validation which check for @ symbol and make sure there is some
     * character before and after the @ symbol
     *
     * @param email
     * @return
     */
    @Override
    public boolean validateEmailAddress(String email) {
        final Matcher matcher = EMAIL_REGEX.matcher(email);
        return matcher.matches();
    }

}
