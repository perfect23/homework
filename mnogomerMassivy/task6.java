package mnogomerMassivy;
/*6. Создайте двумерный массив целых чисел. Отсортируйте элементы в
строках двумерного массива по возрастанию.*/


	import java.util.Random;
	import java.util.Scanner;


	public class task6 {

	    public static void main(String []args) {

	        int temp = 0;
	        int line = 0;
	        int column = 0;

	        Scanner scan = new Scanner(System.in);
	        Random random = new Random();

	        System.out.print("Введи количество строк в матрице: ");
	        line = scan.nextInt();
	        System.out.print("Введи количество столбцов в матрице: ");
	        column = scan.nextInt();

	        int[][] array = new int[line][column];

	        for (int i = 0; i < line; i++) {
	            for (int j = 0; j < column; j++) {
	                array[i][j] = random.nextInt(100);
	            }
	        }

	        for (int i = 0; i < line; i++) {
	            for (int j = 0; j < column; j++) {
	                System.out.print(array[i][j] + "\t");
	            }
	            System.out.println();
	        }

	        System.out.println("Отсортированный по строкам массив: ");

	        for (int i = 0; i < line; i++) {
	            for (int j = 0; j < column; j++) {
	                for (int k = 0; k < j; k++) {           
	                    if (array[i][j] < array[i][k]) {        
	                        temp = array[i][j];
	                        array[i][j] = array[i][k];
	                        array[i][k] = temp;
	                    }
	                }
	            }
	        }

	        for (int i = 0; i < line; i++) {
	            for (int j = 0; j < column; j++) {
	                System.out.print(array[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
	}