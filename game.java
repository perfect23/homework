import java.util.Scanner;
import java.util.Random;
public class game {
	public static void main (String []args){
	// ������ ����������, ���� � ���������� (������� � ������)
		// ������ ������� ( ����� 0 - �����, ������ 100 - �����, ������ �����
		// ������ �����, ������
		Scanner sc = new Scanner (System.in);
		System.out.println ("� ����� �� �������..");
		int numb = sc.nextInt();
		System.out.println ("��� ����� ���)");
		Random rnd = new Random ();
		int comp = rnd.nextInt(100+1)+0;
		while (true){
		if (numb==0){
			System.out.println ("���, ����� ������ � �� ���������!");
	return;
		} else if (numb > comp){
			System.out.println ("������� �����, ����� ������!");
			continue;
		} else if (numb < comp){
			System.out.println ("������� ����, ����� ������!");
			continue;
		
		} else if (numb>100){
			System.out.println ("���, � ������ 100 �� ���������");
			continue;
		} else if (numb==comp){
			System.out.println ("��, �� ������!!!!!!!");
			break;
		}
		
}	
	}
	}

