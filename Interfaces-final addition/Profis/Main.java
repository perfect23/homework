package com.company.Profis;
/*2. Создать классы "Директор", "Рабочий", "Бухгалтер".
Реализовать интерфейс с методом, который печатает название
должности и имплементировать этот метод в созданные классы.*/

public class Main {
    public static void main(String[] args) {
        Director dirOne = new Director();
        Worker worOne = new Worker();
        Bookkeeper booker = new Bookkeeper();

        dirOne.position();
        worOne.position();
        booker.position();

    }
}
