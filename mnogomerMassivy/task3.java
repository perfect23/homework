package mnogomerMassivy;
/*��������� ���� ������
�������� ��� ������� ����� ����� �������� 3�3 (��� �������).
�������� ��������� ��� ��������� ���� ������.
������ ������: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
������ ������: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
��������� ���������: 1 2 3 1 1 1 0 0 0 */
import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();// ���������� ����� ������ �������
		int m=sc.nextInt();
		// ���������� �������� � ������ ������� � ���������� ����� �� ������ �������
		int k=sc.nextInt();// ���������� �������� �� ������ �������
		int Maze[][]=new int[n][m];
		int Maze1[][]=new int[m][k];
		int Maze2[][]=new int[n][k];
		for(int i=0;i<n;i++)// ������ ������ ������ �������
		{
			for(int j=0;j<m;j++)
			{
				Maze[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<m;i++)// ������ ������ ������ �������
		{
			for(int j=0;j<k;j++)
			{
				Maze1[i][j]=sc.nextInt();
				
			}
		}		
				
		for(int i=0;i<n;i++)
		{
			for(int u=0;u<k;u++)
			{
				for(int j=0;j<m;j++)
				{

					Maze2[i][u]+=Maze[i][j]*Maze1[j][u];
				}
			}
		}

		for(int i=0;i<n;i++)// ����� ������� �������
		{
			for(int j=0;j<k;j++)
			{
				System.out.print(Maze2[i][j]+" ");
				
			}
			System.out.println();
		}

	}
}