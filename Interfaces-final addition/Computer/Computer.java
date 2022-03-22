package com.company.Computer;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Computer{
    String model;
    int cost;
    RAM ram;
    HDD hdd;

    public Computer (int cost, String model){
        this.cost = cost;
        this.model = model;

    }
    public Computer (int cost, String model, RAM ram, HDD hdd){
        this.cost=cost;
        this.model=model;
        this.ram= ram;
        this.hdd= hdd;

    }
    public static void main (String[]args){
        RAM ramOne = new RAM ("Ramong", 512);
        HDD hddOne = new HDD("HDDcouter",256, "outside");

        Computer computer1 = new Computer(2000, "DELL" );
        System.out.println("Компьютер " + computer1.model+"."+"Стоимость - "+computer1.cost+" долларов");

        Computer computerSec = new Computer(2500, "HP", ramOne, hddOne);

        System.out.println("Компьютер " + computerSec.model+"."+"Стоимость - "+computerSec.cost+" долларов.\n"
                + computerSec.ram.infoRam()
                + "" + "\n" + computerSec.hdd.infoHdd());


    }

}
