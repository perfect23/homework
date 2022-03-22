package com.company.Computer;

public class RAM {
    String name;
    int volume;

    public RAM(){}
    public RAM (String name, int volume){
        this.name = name;
        this.volume=volume;

    }
    public String infoRam(){
        return "Name of RAM - " + name + ". Volume of RAM - " + volume + ".";
    }

}
