package com.company.Profis;

public class Director implements Positioner {
    public void position() {
        System.out.println("Command and declarate tasks.");
    }

    public static void main(String[] args) {
        Director director = new Director();
        director.position();
    }
}