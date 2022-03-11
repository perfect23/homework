/*7.Реализуйте алгоритм сортировки пузырьком.*/
package massives;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task7 {

    public static void main (String[]args) {

        int size = 0;
        int temp;

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введи размер массива: ");

        size = scan.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));

        temp = array[0];

        for (int i = 0; i < size; i++) {            
            for (int j = 0; j < i; j++) {           
                if (array[j] > array[i]){           
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("Производный массив: " + Arrays.toString(array));
    }
}
