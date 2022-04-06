package com.company.HomeworkException;

import static com.company.HomeworkException.HWException.*;

public class Main {
    public static void main(String[] args) {
        String newDoc = new String("5555-qqq-2222-ihh-1w2w");

        try {
            fifthTask(newDoc);
        } catch (ABCexception e) {
            e.printStackTrace();
        }
        System.out.println();

        try {
            sixthTask(newDoc);
        } catch (SecException e) {

            System.out.println("Без стектрейса - "+e);
        }

        try {
            sevTask(newDoc);
        } catch (thirdException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Try one more time");
        }

    }
}
