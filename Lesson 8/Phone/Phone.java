package com.company.Phone;

public class Phone {
    private String number;
    private String model;
    private String weight;

    public Phone (){}

    public Phone (String number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone (String number, String model,String weight){
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return this.number;
    }

    public String getModel() {
        return this.model;
    }

    public String getWeight() {
        return this.weight;
    }


    public void receiveCall(String nameOfCaller) {
        System.out.println ("Calling is: " + nameOfCaller);

    }
    public void receiveCall( String nameOfCaller, String number){
        System.out.println("Calling is: " + nameOfCaller + "\n number: " + number);
    }


    public void sendMessage ( String...numbers){
        for ( String number : numbers){
            System.out.println("Send message for: " + number);
        }
    }


}

