package massives;
/*1. �������� ������ ����� �����. ������� ��� ��������� ���������
����� �� �������.
����� ����� �������� � ������� (����� Scanner). ���� ������ ����� ��� -
�������� ��������� �� ����.
� ���������� ������ ���� ����� ������ ��� ���������� �����.*/
	

	
		import java.util.Arrays;
		import java.util.Scanner;

		public class firstTask {

		   public static void main(String[] args) {
		 int array[] = {10,12,17,18,28,38,40,46};
		 int count = 0;
		 int size = 0;
		 int value;
		 Scanner scan = new Scanner (System.in);
		 System.out.println ("����� �����");
		 value = scan.nextInt();
		 for( int i = 0; i<7; i++){
		     if(array[i] == value){
		         count++;
		     }
		 }
		if (count == 0){
		    System.out.println("����� ��� � �������");
		}
		for( int i = 0;i< array.length; i++){
		    if(array[i]==value){
		        continue;
		    }else{
		        size++;
		    }
		}
		int array2[] = new int [size];
		for(int i = 0, j=0; i<array2.length; i++, j++){
		    if(array[i] == value){
		        array2[i] = array[j++];
		    }
		    array2[i] = array[j];
		}
		System.out.println(Arrays.toString(array2));
		   }
		}