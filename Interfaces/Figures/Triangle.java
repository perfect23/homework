package com.company.Figures;

public class Triangle extends Figure{
    int sideA;
    int sideB;
    int sideC;
    public Triangle(int sideA, int sideB, int sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }
    public int sqrTriangle(Triangle triangle){
        return sideA*sideB*sideC;
    }
public int perTriangle(Triangle triangle){
        return sideA+sideB+sideC;
    }

    }


