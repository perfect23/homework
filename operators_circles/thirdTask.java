package operators_circles;
/*3. �������� ���������, ������� ����� ��������� �� ���� ����� � ��
����� ����� �������� ��������� ������ ����� ��� ���.
��� ����������� �������� ����� ����������� �������� ���������
������� �� ������� - �������� �������� ���: '% 2').*/
import java.util.Scanner;
public class thirdTask {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int numb = sc.nextInt ();
	    if (numb % 2 == 0){
	        System.out.println(numb +" ��� ������ �����.");
	    } else {
	        System.out.println (numb + " ��� �������� �����.");
	    }
	        
	    }
	}