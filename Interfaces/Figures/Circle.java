package com.company.Figures;

public class Circle {
    int radius;
    double pi = 3.14;
    public Circle (int radius){
        this.radius = radius;
    }
    public double sqrCircle(Circle circle){
        return 2*pi*radius*radius;
    }
    public double perCircle(Circle circle){
        return 2*pi*radius;
    }
}
