package mnogomerMassivy;
/*�������� ��������� ������. �������� �� ������� ��������� �������.*/


import java.util.Random;
import java.util.Scanner;


public class task5 {

    public static void main (String []args) {

        int size = 0;

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("����� ����������� �������: ");
        size = scan.nextInt();

        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n������� ��������� �������:");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    for (int k = 0; k < j; k++) {           
                        System.out.print("\t");
                    }
                    System.out.print(array[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}