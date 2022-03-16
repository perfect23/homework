package com.company.Computer;
import com.company.Computer.RAM;
public class Computer {
    String model;
    int cost;
    String ramName;
    String hddName;
    protected Computer (int cost, String model){
        this.cost = cost;
        this.model = model;
    }
    protected Computer (int cost, String model, String ramName, String hddName){
        this.cost=cost;
        this.model=model;
        this.ramName=ramName;
        this.hddName=hddName;
    }
    public static void main (String[]args){

        Computer computer = new Computer(2000, "DELL" );
        System.out.println("Компьютер " + computer.model+"."+"Стоимость - "+computer.cost+" долларов");

        Computer computerSec = new Computer(2500, "HP", "various #1","various HDD" );
        System.out.println("Компьютер " + computerSec.model+"."+"Стоимость - "+computerSec.cost+" долларов."+
                 "RAM - "+ computerSec.ramName + ". HDD - "+ computerSec.hddName);
    }

}
