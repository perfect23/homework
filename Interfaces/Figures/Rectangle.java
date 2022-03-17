package com.company.Figures;

public class Rectangle extends Figure{
    int sideA;
    int sideB;
    public Rectangle (int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public int sqrRect(Rectangle rectangle){
        return sideA*sideB;
    }
    public int perRect(Rectangle rectangle){
        return sideA+sideB;
    }

    }

