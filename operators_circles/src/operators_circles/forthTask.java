package operators_circles;
/*4. Для введенного числа t (температура на улице) вывести
Если t>–5, то вывести «Тепло».
Если –5>= t > –20, то вывести «Нормально».
Если –20>= t, то вывести «Холодно».*/
import java.util.Scanner;
public class forthTask {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
	        int t = sc.nextInt ();
	        if (t>-5){
	            System.out.println ("Тепло.");
	        } else if (t >= -5 && t> -20) {
	            System.out.println ( " Нормально.");
	        } else if (-20 >= t) {
	            System.out.println ("Холодно");
	        }
	    }
	}