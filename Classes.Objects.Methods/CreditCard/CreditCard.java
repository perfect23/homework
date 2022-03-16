package com.company.CreditCard;
/*1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную
карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard у
которых заданы номер счета и начальная сумма
Тестовый сценарий для проверки:
Положите деньги на первые две карточки и снимите с третьей.
Выведите на экран текущее состояние всех трех карточек.*/
import java.util.Scanner;
public class CreditCard {
    private static int money;
    static String name;
    Scanner sc = new Scanner(System.in);
    int id;           //номер счета
    int currentSum;     //текущая сумма
    public CreditCard(String name, int id, int currentSum){
        this.name = name;
        this.id = id;
        this.currentSum = currentSum;
    }
    public void addMoney(CreditCard creditCard){
    System.out.println("Enter sum wanna to add the "+CreditCard.name+ "?");
        int money = sc.nextInt();
        currentSum +=money;
    }
    public void getMoney(CreditCard creditCard){
    System.out.println("Enter sum wanna to get from the "+CreditCard.name+ "?");
        int money = sc.nextInt();
        currentSum -=money;
    }
    public void current (int currentSum){
        System.out.println("Current balance is " + currentSum + " rubles.");
    }
    public static void main (String[]args){
        CreditCard firstCard = new CreditCard("First Card",2314153, 5000);
        CreditCard secCard = new CreditCard ("Second Card",1234561,10000);
        CreditCard thirdCard = new CreditCard ("Third Card",1928374, 20000);
        System.out.println("Welcome to my ATM!");
        System.out.println("You have "+ firstCard.currentSum +" rubles on the first card account.");
        System.out.println("You have "+ secCard.currentSum +" rubles on the second card account.");
        System.out.println("You have "+ thirdCard.currentSum +" rubles on the third card account.");
        firstCard.addMoney(firstCard);
        System.out.println("Balance of first card is " + firstCard.currentSum+ ".");
        secCard.addMoney(secCard);
        System.out.println("Balance of second card is " + secCard.currentSum+ ".");
        thirdCard.getMoney(thirdCard);
        System.out.println("Balance of third card is " + thirdCard.currentSum+ ".");

        //не понимаю почему выводится в консоль что все операции с третьей картой....

    }
}
