package com.company.HomeWorkIO;



import java.io.*;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String REL_PATH = "E:\\JavaProj\\Lesson 12 - IO Files\\files";
        String pathWay = sc.nextLine();
        FileReader fr = null;



        try {

            fr = new FileReader(pathWay);

            //создаем BufferedReader с существующего FileReader для построчного считывания

            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку

            String line = reader.readLine();
            String[] arr = new String[9]; //массив для считывания номеров
            String ver; //переменная для номеров
            List<String> list = new ArrayList<>();
            List<String> list1 = new ArrayList<>();
            List<String> valNums = new ArrayList<>();
            while (line != null) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = reader.readLine();
                }
                line = reader.readLine();


            }
            System.out.println("Получены номера документов.");
            for (int j = 0; j < arr.length; j++) {
                ver = arr[j];
                if ((ver.startsWith("docnum") || ver.startsWith("contract")) && (ver).length() == 15) {
                    valNums.add(ver);

                 //   System.out.println("Doc number - " + "\"" + ver + "\"" + " is Valid. ");

                } else {
                   // System.out.print("Doc number - " + "\"" + ver + "\"" + " is invalid. ");
                    if (!(ver.startsWith("docnum") || ver.startsWith("contract"))) {
                        list.add(ver);
                      //  System.out.println("!Wrong start!");


                    }
                    if (ver.length() != 15) {
                        list1.add(ver);
                       // System.out.println("!Wrong size!");
                    }
                }


            }
           // System.out.println(valNums.toString()); //валидные номера
           // System.out.println(list.toString()); //невалидные по тексту
           // System.out.println(list1.toString()); //невалидные по размеру
            try (FileWriter writer =
                         new FileWriter(
                                 REL_PATH + "\\" + "validDocs.txt")) {

                writer.write(String.valueOf(valNums));
                writer.append("\n!is Valid!");
                writer.flush();


                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            try (FileWriter writer1 =
                         new FileWriter(
                                 REL_PATH + "\\" + "InvalDocsText.txt")) {

                writer1.write(String.valueOf(list));
                writer1.append("\n!Wrong start!\n");
                writer1.write(String.valueOf(list1));
                writer1.append("\n!Wrong size!");
                writer1.flush();
            } catch (IOException ex) {
                ex.printStackTrace();
            }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        finally {
            sc.close();

        }

        }


}