import java.util.Scanner;
import java.util.Random;
public class game {
	public static void main (String []args){
	// Задать переменные, свои и компьютера (сканнер и рандом)
		// Задать условия ( равно 0 - вылет, больше 100 - вылет, больше числа
		// Меньше числа, угадал
		Scanner sc = new Scanner (System.in);
		System.out.println ("Я думаю ты загадал..");
		int numb = sc.nextInt();
		System.out.println ("Это точно оно)");
		Random rnd = new Random ();
		int comp = rnd.nextInt(100+1)+0;
		while (true){
		if (numb==0){
			System.out.println ("Нет, такую ерунду я не загадываю!");
	return;
		} else if (numb > comp){
			System.out.println ("Слишком много, давай меньше!");
			continue;
		} else if (numb < comp){
			System.out.println ("Слишком мало, давай больше!");
			continue;
		
		} else if (numb>100){
			System.out.println ("Нет, я больше 100 не загадываю");
			continue;
		} else if (numb==comp){
			System.out.println ("Да, ты УГАДАЛ!!!!!!!");
			break;
		}
		
}	
	}
	}

