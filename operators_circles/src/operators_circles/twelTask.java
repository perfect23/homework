package operators_circles;
/*2. �� ������ ����� ���� ��������� � ����� ������ 7% �� �����.
�������� ���������, � ������� ������������ ������ ����� ������ �
���������� �������. � ���� ��������� �������� ����� ������ � ������
���������� ��������� �� ������ �����.
��� ���������� ����� � ������ ��������� ����������� ���� for. �����
����� ������ ����� ������������ ��� float.*/
import java.util.Scanner;
public class twelTask {

	public static void main(String[] args) {

Scanner sc = new Scanner( System.in);
Scanner tc = new Scanner ( System.in);
System.out.println (" enter sum");
float sum = sc.nextFloat();
System.out.println ( "enter months");
int mon = tc.nextInt();
float profit = 0;
int x = 0;
for ( x = 1; x <= mon; x++){
  profit = sum + x* (sum * 7/100);
  System.out.println (profit);
}
}
}