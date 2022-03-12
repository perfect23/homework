package operators_circles;
/*5. ѕо введенному номеру определить цвет радуги (1 Ц
красный, 4 Ц зеленый и т. д.).*/
import java.util.Scanner;
public class fifthTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		   int color = sc.nextInt();
		   String rainbow = switch(color){
		      case 1->"red";
		       case 2->"orange";
		      case 3->"yelow";
		       case 4->"green";
		      case 5->"blue";
		       case 6->"d.blue";
		       case 7->"fiolet";
		       default -> "not a color";
		   };
		   
		    }
		}