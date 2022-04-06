package com.company.HomeworkException.taskTwo;

import com.company.HomeworkException.taskTwo.Exceptions.WrongLoginException;
import com.company.HomeworkException.taskTwo.Exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        try {
           boolean result =  PasswordCheker.checkPass("perfect23","ret2341","ret2341");
            System.out.println(result);
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }
}
