package operators_circles;
/*4. ��� ���������� ����� t (����������� �� �����) �������
���� t>�5, �� ������� ������.
���� �5>= t > �20, �� ������� ����������.
���� �20>= t, �� ������� ��������.*/
import java.util.Scanner;
public class forthTask {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
	        int t = sc.nextInt ();
	        if (t>-5){
	            System.out.println ("�����.");
	        } else if (t >= -5 && t> -20) {
	            System.out.println ( " ���������.");
	        } else if (-20 >= t) {
	            System.out.println ("�������");
	        }
	    }
	}