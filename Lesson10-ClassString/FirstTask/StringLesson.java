package com.company.ClassString.Lesson;


public class StringLesson {

    public String doc;

    static void firstTask (String doc){
        System.out.println(""+doc.charAt(0) + doc.charAt(1)+doc.charAt(2)+doc.charAt(3)+"-"+
                doc.charAt(9)+doc.charAt(10)+doc.charAt(11) +doc.charAt(12)); // Вывести на экран в одну строку два первых блока по 4 цифры.
        //почему без пустой строки складывает код элементов?
    }
    static void secTask (String doc){
        System.out.println(doc.replace("abc","***").replace("def","***"));
        //Вывести на экран номер документа, но блоки из трех букв заменить на ***
    }
    static void thirdTask (String doc){
        System.out.println(doc.substring(5,8)+ "/"+doc.substring(14,17) + "/" + doc.charAt(19) + "/"+doc.charAt(21));
        //Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
    }
    static void fourthTask (String doc) {
        /*Вывести на экран буквы из номера документа в формате
        "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
                класса StringBuilder).    */
        StringBuilder sB = new StringBuilder(doc);
        System.out.println("Letters:" + sB.substring(5,8).toUpperCase()+"/"+sB.substring(14,17).toUpperCase()+"/"+
                sB.substring(19,20).toUpperCase()+"/"+sB.substring(21,22).toUpperCase());
    }
    static void fifthTask(String doc){
        /*Проверить содержит ли номер документа последовательность abc и
вывети сообщение содержит или нет(причем, abc и ABC считается
одинаковой последовательностью).*/

        System.out.println("Doc number contains \"abc\" - " + doc.contains("abc"));
    }
    static void sixthTask(String doc){
        /*Проверить начинается ли номер документа с последовательности
555.*/
        System.out.println("Doc number begins from \"555\" - " + doc.startsWith("555"));
    }
    static void sevTask(String doc){
        /*Проверить заканчивается ли номер документа на
последовательность 1a2b */

        System.out.println("Doc number ends on \"1a2b\" - " + doc.endsWith("1a2b"));
    }

}
