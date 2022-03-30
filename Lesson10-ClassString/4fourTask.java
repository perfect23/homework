package com.company.ClassString.Lesson;

public class fourTask {
    public static void main(String[] args) {
         /*4. Дана строка произвольной длины с произвольными словами.
Написать программу для проверки является ли любое выбранное слово в
строке палиндромом.*/
        String four = new String("Catch all if you can");

        four = four.join("","Catch","all","if","you","can");

        StringBuilder def = new StringBuilder(four);
        def = def.reverse();

        String sDef = new String(def);
        if(four.equalsIgnoreCase(sDef) == true){
            System.out.println( "Это паллиндром.");
        }else{
            System.out.println("Это не паллиндром.");
        }
    }
}
