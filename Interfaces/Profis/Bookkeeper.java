package com.company.Profis;

public class Bookkeeper implements Positioner{
    public void position(){
        System.out.println("Count money.");
    }

    public static void main(String[] args) {
        Bookkeeper booker = new Bookkeeper();
        booker.position();
    }
}
