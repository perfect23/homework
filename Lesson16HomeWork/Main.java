package com.company.Lesson16HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
    //создание рандомного списка
        List <Integer> list = new ArrayList<>(getRandomList(20));
        System.out.println(list);
        Stream<Integer>stream = list.stream();

    //удаление дубликатов

        List<Integer> distinct1 = list.stream().sorted().distinct().collect(toList());
        System.out.println("Deleting dublicates: "+distinct1);

       //Вывести все четные значения от 7 до 17
        List<Integer> liststream = list.stream().filter((l)->(l%2 ==0) && (l>=7) && (l<=17))
                .collect(toList());
        System.out.println(liststream);
     //Каждый элемент умножить на 2
        List<Integer> two = list.stream()
                .sorted()
                .map(t->t*2)
                .collect(toList());
        System.out.println(two);

        //Отсортировать и вывести на экран первых 4 элемента
        System.out.print("Sorted and output first 4: ");
        stream.sorted().limit(4).forEach(x->System.out.format("%s, ",x));
        System.out.println();

        //- Вывести количество элементов в стриме

        Stream<Integer>stream1 = list.stream();
        System.out.println("Stream count: " + stream1.count());

//        - Вывести среднее арифметическое всех чисел в стриме
        Double sq = list.stream().collect(Collectors.averagingInt(Integer::intValue));

        System.out.println("Average: " + sq);

        //Дополнительное задание
        //2. Создать коллекцию класса ArrayList со значениями имен всех студентов
        //в группе
        List<String> names = Arrays.asList("Sergey","Dmitriy","Aleksey","Svetlana","Maria","Andrey","Anton","Innokentii");
        System.out.println(names);
        //- Вернуть количество количество людей с вашим именем (вне
        //зависимости от верхнего/нижнего регистра букв)
       var first = names.stream().filter((f) -> {
            return f.equalsIgnoreCase("Sergey");
        })
                .count();
        System.out.println(first);

//        - Выбрать все имена, начинающиеся на "а" (вне зависимости от
//        верхнего/нижнего регистра букв)
        List<String> sec = names.stream().filter((s) -> {
          return s.startsWith("A") || s.startsWith("a");
        }).collect(toList());
        System.out.println(sec);
//        - Отсортировать и вернуть первый элемент коллекции или
//        "Empty@, если коллекция пуста
        System.out.println(
                names.stream().findFirst().orElse("Empty")
        );


    }

    public static List<Integer> getRandomList(int count) {
        return new Random()
                .ints(0, 100)
//                .distinct()
                .limit(count)
                .boxed()
                .collect(toList());
    }
}