package com.company.Computer;

public class HDD {
    static String name;
    static int volume;
    static String type;
    private HDD(String name, int volume, String type){
        this.name = name;
        this.volume = volume;
        this.type = type;
    }
    public void infoHdd(){
        System.out.println("Название HDD - "+ HDD.name+". "+ "Объем HDD - "+HDD.volume+". " + "Тип HDD - " + HDD.type);
    }
    public static void main (String[]args){
        HDD hdd = new HDD("various", 512,"Outside");
        hdd.infoHdd();
    }
}
