package mnogomerMassivy;
/*4. �������� ��������� ������ ����� �����. �������� �� ������� �����
���� ��������� �������.*/


	import java.util.Random;
	import java.util.Scanner;

	public class task4 {

	    public static void main(String[]args) {

	        int line = 0;
	        int column = 0;
	        int summ = 0;

	        Scanner scan = new Scanner(System.in);
	        Random random = new Random();

	        System.out.print("����� ����������� �������. ������� ������ ������: ");
	        line = scan.nextInt();
	        System.out.print("����� ����������� �������. ������ ������ �������: ");
	        column = scan.nextInt();

	        int[][] array = new int[line][column];

	        for (int i = 0; i < line; i++) {
	            for (int j = 0; j < column; j++) {
	                array[i][j] = random.nextInt(100);
	            }
	        }

	        for (int i = 0; i < line; i++) {
	            for (int j = 0; j < column; j++) {
	                summ += array[i][j];
	            }
	        }

	        for (int i = 0; i < line; i++) {
	            for (int j = 0; j < column; j++) {
	                System.out.print(array[i][j] + "\t");
	            }
	            System.out.println();
	        }
	        System.out.println("����� ���� ��������� ������� �����: " + summ);
	    }
	}