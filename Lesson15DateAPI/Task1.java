package com.company.Lesson15DateAPI;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String nowFormat = now.format(form);
        System.out.println("Today is: "+nowFormat);
//
//        1. Написать программу для вывода на консоль названия дня недели по
//        введенной дате.
        var dayOfWeek = now.getDayOfWeek();
        System.out.println("Day of week: "+dayOfWeek);

//        2. Написать программу для вывода на экран дату следующего вторника.
        TemporalAdjuster nextTue = TemporalAdjusters.next(DayOfWeek.TUESDAY);
        var nextTuesday = now.with(nextTue).format(form);
        System.out.println("Next Tuesday will be: "+nextTuesday);
    }
}



