package com.company.Computer;

public class RAM {
    static String name;
    static int volume;

    private RAM (String name, int volume){
        this.name = name;
        this.volume=volume;
    }
    public void infoRam(){
        System.out.println("Название RAM - "+ RAM.name+". "+ "Объем RAM - "+RAM.volume);
    }
    public static void main(String[]args){
        RAM ram = new RAM ("various#1",512);
        ram.infoRam();
    }
}
