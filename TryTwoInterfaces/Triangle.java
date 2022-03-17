package com.company.TryTwoInterfaces;

public class Triangle implements Figure{
    double sideA;
    double sideB;
    double sideC;
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calcSquare(){
        return sideA*sideB*sideC;
    }
    public double calcPer (){
        return sideA+sideB+sideC;
    }

}



