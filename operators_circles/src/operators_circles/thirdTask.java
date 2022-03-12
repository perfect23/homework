package operators_circles;
/*3. Напишите программу, которая будет принимать на вход число и на
выход будет выводить сообщение четное число или нет.
Для определения четности числа используйте операцию получения
остатка от деления - операция выглядит так: '% 2').*/
import java.util.Scanner;
public class thirdTask {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int numb = sc.nextInt ();
	    if (numb % 2 == 0){
	        System.out.println(numb +" Это Четное число.");
	    } else {
	        System.out.println (numb + " Это неЧетное число.");
	    }
	        
	    }
	}