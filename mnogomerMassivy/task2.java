package mnogomerMassivy;
/*2. Шахматная доска
Создать программу для раскраски шахматной доски с помощью цикла.
Создать двумерный массив String'ов 8х8. С помощью циклов задать
элементам циклам значения B(Black) или W(White).*/


	public class task2 {

	    public static void main (String[]args){

	        int size = 8;
	        String black = "B";
	        String white = "W";

	        String[][] desk = new String[size][size];

	        for (int i = 0; i < size; i++) {            
	            for (int j = 0; j < size; j++) {
	                if ((i % 2 == 0)) {                 
	                    desk[i][j] = white;
	                    desk[i][++j] = black;
	                }
	                if ((i % 2 == 1)) {                 
	                    desk[i][j] = black;
	                    desk[i][++j] = white;
	                }
	            }
	        }

	        for (int i = 0; i < size; i++) {            
	            for (int j = 0; j < size; j++) {
	                System.out.print(desk[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}
