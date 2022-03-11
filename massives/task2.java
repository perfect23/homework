/*2.—оздайте и заполните массив случайным числами и выведете
максимальное, минимальное и среднее значение.
ƒл€ генерации случайного числа используйте метод Math.random().
ѕусть будет возможность создавать массив произвольного размера.
ѕусть размер массива вводитс€ с консоли.*/

package massives;
import java.util.Scanner;
public class task2 {

	public static void main(String[] args) {

        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random()*100)+100;
        }

        double max = array[99]; // ћассив не должен быть пустым
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];
            if(min > array[i])
                min = array[i];
            avg += array[i]/array.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }}