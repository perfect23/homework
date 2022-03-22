package com.company.Computer;

public class HDD {
    String name;
    int volume;
    String type;

    public HDD (){

    }
    public HDD(String name, int volume, String type){
        this.name = name;
        this.volume = volume;
        this.type = type;
    }
    public String infoHdd(){
        return "Name of HDD - " + name + ". Volume of HDD - " + volume + ". Type of HDD - " + type + ".";
    }

}
