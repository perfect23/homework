/*
* 4. �������� ������ �� n ��������� ����� ����� � �������� ��� �� �����.
     ������ ������� ����� �������� � ������� � ������ ������� ����� ����
     ������ 5 � ������ ��� ����� 10.
     ���� n �� ������������� ������� - �������� ��������� �� ����.
     ���� ������������ ��� �� ���������� �����, �� ��������� ������
     ������� ������������ ��������� ����.
     �������� ������ ������ ������ �� ������ ��������� ������� �������,
     ���� ��� ��� ����, � ������� ��� �� �����.
* */

package massives;
import java.util.Arrays;
import java.util.Scanner;
public class task4 {
public static void main (String[]Args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Choose number of array");
	while(true) {
		int length2 = 0;
		int length = scanner.nextInt();
		if (length > 5 && length <=10) {
			int[]array = new int [length];
			for (int i =0; i< array.length;i++) {
				array[i] = (int)(Math.random()*length);
			}
			System.out.println(Arrays.toString(array));
			for (int j = 0; j < 0; j++) {
				if(array[j]%2 == 0 && array[j] != 0) {
					length2++;
				}
			}
			int array2[] = new int[length2];
			int counter = 0;
			for(int k = 0; k<array.length; k++) {
				if(array[k]%2 == 0 && array[k] != 0) {
					array2[counter] = array[k];
					counter++;
					
				}
			}
			System.out.println(Arrays.toString(array2));
			break;
		} else {
			System.out.println("Another digit");
			continue;
		}
	}
}
}
