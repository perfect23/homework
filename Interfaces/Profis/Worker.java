package com.company.Profis;

public class Worker implements Positioner{
public void position (){
    System.out.println("Working.");

}

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.position();
    }
}
