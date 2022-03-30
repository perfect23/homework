package com.company.ClassString.Lesson;

public class thirdTask {

        /*3. Дана строка произвольной длины с произвольными словами.
Найти слово, в котором число различных символов минимально. Слово
может содержать буквы и цифры. Если таких слов несколько, найти первое
из них. Например, в строке "fffff ab f 1234 jkjk" найденное слово должно
быть "fffff".*/
        public static int myWords(String st){ // число уникальных символов
            StringBuffer u = new StringBuffer(); // строка, в которой каждый символ будет содержаться лишь однажды
            String c; // текущий символ в строке
            for (int i=0;i<st.length();i++) { // обход строки
                c = String.valueOf(st.charAt(i)); // получить текущий символ
                if (u.indexOf(c)==-1) // символ еще не встречался
                    u.append(c); // добавляем
            }

            return u.length(); // возвращаем длину получившейся строки
        }

    public static void main(String[] args) {
        String[] a = {"abuse", "inkognito", "atorvastatin","metadon","augmentin","WOOOOOOO"};
        String goal = a[0]; // искомое слово
        System.out.println("Массив: ");
        for (int i=1;i<a.length;i++){
            System.out.print(a[i]+", "); // выводим очередной элемент
            if ( myWords(a[i])<myWords(goal))
                goal = a[i]; // новый мин.эл
        }
        System.out.println("");
        System.out.println("Искомое слово: "+goal+", число разных символов: "+myWords(goal));
    }
}
    //решение из интернета, просто для себя, чтоб было)

