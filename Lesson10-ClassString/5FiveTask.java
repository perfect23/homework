package com.company.ClassString.Lesson;
/*
5. Дана произвольная строка.
        Вывести на консоль новую строку, которой задублирована каждая буква из
        начальной строки.
        Например, "Hello" -> "HHeelllloo".*/
public class FiveTask {
    public static void main(String[] args) {
        StringBuilder five = new StringBuilder("Never");
        System.out.println(five.insert(4,'r').insert(3,'e').insert(2,'v').insert(1,'e').
                insert(0,'N'));

    }
}
//как смог, уже слишком много времени убил)