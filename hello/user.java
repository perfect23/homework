package hello;
import java.util.Scanner;
public class user {
    public static void main (String []args){
        System.out.println ("Введите имя пользователя!");
        Scanner console = new Scanner (System.in);
        String name = console.nextLine ();
        System.out.println (("Привет, ") + name + (", как дела?"));
    }
}
