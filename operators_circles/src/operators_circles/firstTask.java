package operators_circles;
/*1. Написать программу для вывода названия поры года по номеру
месяца.
При решении используйте оператор switch-case.*/

public class firstTask {

	public static void main(String[] args) {
		int month = 3;
		

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println ("зима");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println ("весна");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println ("лето");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println ("осень");
			break;
		
		}

	}

}
