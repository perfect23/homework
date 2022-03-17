package com.company.TryTwoInterfaces;

public class Circle implements Figure{
    private double radius;


    public Circle (double radius){
        this.radius = radius;
    }
    public double calcSquare(){
        return 2*3.14*radius*radius;
    }
    public double calcPer(){
        return 2*3.14*radius;
    }


}
