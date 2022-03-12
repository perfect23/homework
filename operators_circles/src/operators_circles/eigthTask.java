package operators_circles;
/*3. Напишите программу, где пользователь вводит любое целое
положительное число. А программа суммирует все числа от 1 до
введенного пользователем числа.
Для ввода числа воспользуйтесь классом Scanner.*/
import java.util.Scanner;
public class eigthTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numb = sc.nextInt ();
		int h = 0;
		int sum = 0;
		for (h =1; h <= numb; h++){
		  sum += h;
		  
		  System.out.println ( sum);
		  
		} 
		}
		  

		}