package com.company.Figures;

/*Написать иерархию классов «Фигуры».
Фигура -> Треугольник -> Прямоугольник ->
 Круг.
Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
периметра.
Создать массив из 5 фигур.
Вывести на экран сумму периметра всех фигур в массиве.*/
public class Figure {
    public static void main(String[] args) {
        Rectangle rectAng = new Rectangle(20,12);
        Rectangle rect1 = new Rectangle(21,13);
        Rectangle rect2 = new Rectangle(25,13);
        Rectangle rect3 = new Rectangle(15,25);
        rectAng.sqrRect(rectAng);            //площадь прямоугольника
        System.out.println("Площадь прямоугольника - "+rectAng.sqrRect(rectAng));
        rectAng.perRect(rectAng);            //периметр прямоугольника
        System.out.println("Периметр прямоугольника - "+rectAng.perRect(rectAng));

        Triangle triangle = new Triangle(2,3,5);
        triangle.sqrTriangle(triangle);       //площадь треугольника
        System.out.println("Площадь треугольника - "+ triangle.sqrTriangle(triangle));
        triangle.perTriangle(triangle);        //периметр треугольника
        System.out.println("Периметр треугольника - " + triangle.perTriangle(triangle));

        Circle circle = new Circle(13);
        circle.sqrCircle(circle);           //площадь круга
        System.out.println("Площадь круга - " + circle.sqrCircle(circle));
        circle.perCircle(circle);            //периметр круга
        System.out.println("Периметр круга - " + circle.perCircle(circle));

        rect1.sqrRect(rect1);      //дополнительные фигуры
        rect2.sqrRect(rect2);
        rect3.sqrRect(rect3);
        int sumSqr = 0;
        int [] array = new int [] {rectAng.sqrRect(rectAng), triangle.sqrTriangle(triangle), rect1.sqrRect(rect1), rect2.sqrRect(rect2), rect3.sqrRect(rect3)};
        for(int i=0; i<=4; i++){
            sumSqr += array[i];

        }
        System.out.println("Сумма площадей массива из пяти фигур = " + sumSqr);
    }
    }


