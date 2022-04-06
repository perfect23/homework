package com.company.HomeworkException;

public class HWException {
    static void fifthTask (String doc)throws ABCexception{
        /*Проверить содержит ли номер документа последовательность abc и
вывети сообщение содержит или нет(причем, abc и ABC считается
одинаковой последовательностью).*/

        System.out.println("Doc number contains \"abc\" - " + doc.contains("abc"));
        if (doc.contains("abc") == false){
            throw new ABCexception("DOc doesnt exist this");
        }else{
            return;
        }
    }
    static void sixthTask(String doc)throws SecException{
        /*Проверить начинается ли номер документа с последовательности
555.*/
        System.out.println("Doc number begins from \"555\" - " + doc.startsWith("555"));
        if (doc.startsWith("555")==false){
            throw new SecException("There is not starts from 555");
        }
    }
    static void sevTask(String doc)throws thirdException{
        /*Проверить заканчивается ли номер документа на
последовательность 1a2b */

        System.out.println("Doc number ends on \"1a2b\" - " + doc.endsWith("1a2b"));
        if (doc.endsWith("1a2b")==false){
            throw new thirdException();
        }else{
            return;
        }
    }
}
