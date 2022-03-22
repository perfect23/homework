package com.company.TryTwoInterfaces;

public class Rectangle implements Figure{
    double sideA;
    double sideB;

    public Rectangle (double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

        public double calcSquare () {
            return sideA * sideB;
        }


        public double calcPer () {
            return 2 * sideA * sideB;
        }
    }
