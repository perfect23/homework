package com.company.Phone;

public class Main {
    public static void main(String[] args) {
        Phone iphoneOne = new Phone("+375336264589", "Iphone 10", "315 grammes");
        Phone iphoneTwo = new Phone("+375336434289", "Iphone 11", "320 grammes");
        Phone iphoneThree = new Phone("+375336495489", "Iphone 12", "345 grammes");

        System.out.println("Number - " + iphoneOne.getNumber() + ". Model - " + iphoneOne.getModel() +
                ". Weight - " + iphoneOne.getWeight());
        System.out.println("Number - " + iphoneTwo.getNumber() + ". Model - " + iphoneTwo.getModel() +
                ". Weight - " + iphoneTwo.getWeight());
        System.out.println("Number - " + iphoneThree.getNumber() + ". Model - " + iphoneThree.getModel() +
                ". Weight - " + iphoneThree.getWeight());

        iphoneOne.receiveCall("FirstCaller");
        iphoneTwo.receiveCall("SecondCaller");
        iphoneThree.receiveCall("ThirdCaller");

        iphoneOne.receiveCall("FourthCaller", "+375293765544");

        iphoneOne.sendMessage("+37529345681","+37529374682","+37529345863","+37529336984","+37529399685");





    }
}
