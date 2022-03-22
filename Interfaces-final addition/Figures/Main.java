package com.company.TryTwoInterfaces;
/*1. Написать иерархию классов «Фигуры».
Фигура -> Треугольник -> Прямоугольник -> Круг.
Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
периметра.
Создать массив из 5 фигур.
Вывести на экран сумму периметра всех фигур в массиве.*/

public class Main {
    public static void main(String[] args) {
        Rectangle rectFirst = new Rectangle(10,15);
        Triangle triFirst = new Triangle(25,21,23);
        Circle circFirst = new Circle(13);

            rectFirst.calcSquare();
            rectFirst.calcPer();
            triFirst.calcPer();
            triFirst.calcSquare();
            circFirst.calcSquare();
            circFirst.calcPer();
        System.out.println("Площадь прямоугольника - " + rectFirst.calcSquare() +
                "\n Периметр прямоугольника - " + rectFirst.calcPer() +
                "\n Площадь треугольника - " + triFirst.calcSquare() +
                "\n Периметр прямоугольника - " + triFirst.calcPer() +
                "\n Площадь круга - " + circFirst.calcSquare() +
                "\n Периметр круга - " + circFirst.calcPer());

        // пять фигур
        Rectangle recOne = new Rectangle(12,23);
        Rectangle recTwo = new Rectangle(13,24);
        Triangle triOne = new Triangle(11,12,13);
        Triangle triTwo = new Triangle(12,13,14);
        Circle cirOne = new Circle(23);
        double sum = 0;
        Figure [] figures  = {recOne, recTwo,triOne,
                triTwo, cirOne};
        for ( Figure f : figures){
            sum += f.calcPer();
        }
        System.out.println("Сумма периметров пяти фигур равна " + sum);

    }
}
