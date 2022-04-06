package com.company.HomeworkException.taskTwo;

import com.company.HomeworkException.taskTwo.Exceptions.WrongLoginException;
import com.company.HomeworkException.taskTwo.Exceptions.WrongPasswordException;

public class PasswordCheker {

    public static boolean checkPass(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        int LOGIN_MAX_LENGTH = 20;
        if (login.length() > LOGIN_MAX_LENGTH || login.contains(" ")){
            throw new WrongLoginException("Login is wrong");
        }
        if (password.length() < LOGIN_MAX_LENGTH || password.contains(" ") || !login.matches(".*\\d.*")
        || !password.equals(confirmPassword)){
            throw new WrongPasswordException("Password is Wrong");
        }


        return true;
    }
}
