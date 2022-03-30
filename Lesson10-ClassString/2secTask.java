package com.company.ClassString.Lesson;
/*2.Дана строка произвольной длины с произвольными словами.
Найти самое короткое слово в строке и вывести его на экран.
Найти самое длинное слово в строке и вывести его на экран.
Если таких слов несколько, то вывести последнее из них.*/

// Просто уже голову сломал, сделал как смог)
public class secTask {
    public static void main(String[] args) {
        String sec = new String("You will newer walk alone - Liverpool");
        String [] words = sec.split(" ");
        int min = words[0].length();
        int max = words[0].length();

        for (int i = 0; i < words.length; i++){
            min = Math.min(min, words[i].length());
            max = Math.max(max, words[i].length());
            if(min == 1){
                System.out.println("Minimum chars in - " +"\""+words[i]+"\"");
                }
                else if(max == 9){
                    System.out.println("MMaximum chars in - "+"\""+words[i]+"\"");


            }
            }

        }

        }


