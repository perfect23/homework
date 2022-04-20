package com.company.Lesson15DateAPI.Task3;

import java.util.Scanner;

public class OneClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "";

        while (true){
            System.out.println("Enter 2 to find factorial of number 5. Enter 1 to get reverse of string \"Hello to everyone\".");
            choice = sc.next();
            if (choice.equals("2")) {
                Interfaceble<Integer> react = (n) -> {
                    int result = 1;
                    for (int i = 1; i <= n; i++) {
                        result = i * result;
                    }
                    return result;
                };
                System.out.println(react.getvalue(5));
            } else if (choice.equals("1")) {
                Interfaceble<String> inters = (n) -> String.valueOf(new StringBuffer(n).reverse());
                System.out.println(inters.getvalue("Hello to everyone"));
            }
            else {
                return;
            }

        }

    }
}



//        System.out.println("Factorial of number: "+factorial(5));
//        System.out.println("Number of Fibonacci: "+fib(10));

//    public static int fact(int n){
//        if (n<=1){
//            return 1;
//        }
//        return n*fact(n-1);
//
//    }
//    public static int fib(int n){
//        if (n<2){
//            return n;
//        }
//
//        return fib(n-1)+fib(n-2);
//    }
//}
