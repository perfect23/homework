package massives;
/*0. �������� ������ ����� �����. �������� ���������, ������� �������
��������� � ���, ������ �� �������� ����� � ������ ��� ���.
����� ����� ��� ������ �������� � ������� (����� Scanner).
*/
import java.util.Scanner;

public class task0 {
public static void main (String[]Args) {
	Scanner sc = new Scanner (System.in);
	int [] arr = {2,3,4,5,5,6};
	System.out.println("Please, enter the number");
	int numb = sc.nextInt();
	while(true) {
	for(int i = 0; i<5; i++) {
		if(numb == arr[i]) {
			System.out.println("Number is entered");
			return;
		
		} 
			
		}
	}
}

}