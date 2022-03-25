package Vectors;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        VectorTwoD vec2Dfirst = new VectorTwoD(12,13);
        VectorTwoD vec2Dsec = new VectorTwoD(13,14);
        VectorThreeD v3d1 = new VectorThreeD(11,12,13);
        VectorThreeD v3d2 = new VectorThreeD(25,12,13);

        double length = vec2Dfirst.VectLength(); //длина вектора
        double dotProduct  = vec2Dfirst.Dot (vec2Dsec);//скалярное произведение векторов
        VectorTwoD plusVect2d = vec2Dfirst.addVector(vec2Dsec); //сумма векторов
        VectorTwoD minusVect2d = vec2Dfirst.minusVector(vec2Dsec); //разность векторов
        vec2Dfirst.compare(vec2Dsec);//сравнение векторов

        System.out.println(vec2Dfirst.toString()); // для двумерных векторов
        System.out.println("Длина вектора - " + vec2Dfirst.VectLength());
        System.out.println("Скалярное произведение векторов - " + vec2Dfirst.Dot (vec2Dsec));
        System.out.println("Сумма векторов - " + vec2Dfirst.addVector(vec2Dsec));
        System.out.println("Разность векторов - " + vec2Dfirst.minusVector(vec2Dsec));
        System.out.println("Сравнение векторов - " + vec2Dfirst.compare(vec2Dsec));
        System.out.println("Массив векторов - " + Arrays.toString(VectorTwoD.createVectors(3)));

        System.out.println(vec2Dfirst.toString()); // для трехмерных векторов
        System.out.println("Длина вектора - " + v3d1.VectLength());
        System.out.println("Скалярное произведение векторов - " + v3d1.Dot (v3d2));
        System.out.println("Сумма векторов - " + v3d1.addVector(v3d2));
        System.out.println("Разность векторов - " + v3d1.minusVector(v3d2));
        System.out.println("Сравнение векторов - " + v3d1.compare(v3d2));
        System.out.println("Массив векторов - " + Arrays.toString(VectorThreeD.createVectors(4)));

    }
}

