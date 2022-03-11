package massives;

/*5. Создайте массив и заполните массив.
Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль.
Снова выведете массив на экран на отдельной строке.*/
import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        int [] mas = new int[8];
       
        for (int i = 0; i < mas.length; i++) {
             mas[i] = (int)(Math.random()*10)+1;
        }
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if(i%2 == 1){
                mas[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}