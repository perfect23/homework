
import java.util.Scanner;
public class Farenheit {

    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        double celsium = console.nextDouble ();
        double farenheit = celsium * 9/5 + 32;
        System.out.println (farenheit);
	// write your code here
    }
}
