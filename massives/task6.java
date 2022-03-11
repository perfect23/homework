
package massives;
/*6. Создайте массив строк. Заполните его произвольными именами
людей.
Отсортируйте массив.
Результат выведите на консоль.*/

	import java.util.Arrays;

	public class task6 {

	    public static void main(String[]Args) {

	        String[] names = new String[]{"саша", "даша", "маша", "Стас", "никита", "Сергей", "Оля"};

	        System.out.println("Список имен до сортировки: " + Arrays.toString(names));
	        Arrays.sort(names);
	        System.out.println("Список имен после сортировки: " + Arrays.toString(names));

	    }
	}


