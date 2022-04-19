package com.company.HomeworkCollections;

import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String filePath = "";
        String report = "E:\\JavaProj\\Lesson14-collections\\src\\com\\company\\HomeworkCollections\\report.txt";

        FileInputStream fl = null;
//        FileReader fr = new FileReader(String.valueOf(fl));
        List<String> fileNames = new ArrayList<>();
        HashSet<String> docNums = new HashSet<>();
        HashMap<String, String> map = new HashMap<>();



        //получение путей к документам


        while (true) {
            System.out.println("Please, enter filepath and filename");
            filePath = sc.nextLine();


            if (filePath.equals("0")) {
                System.out.println("Okay. Thanks");
                break;
            }
            String fileName = "E:\\JavaProj\\Lesson14-collections\\src\\com\\company\\HomeworkCollections\\"+filePath;
            fileNames.add(fileName);
        }
//        System.out.println(fileNames.toString());

        //        вычитывание номеров документов и обработка
        String str = "";
        String line;
        FileReader fr = null;
        for (int i = 0; i < fileNames.size(); i++) {
            str = fileNames.get(i);


            try {
                fr = new FileReader(str);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader br = new BufferedReader(fr);
                while (true){
                    try {
                        if (!((line = br.readLine())!=null)) break;
                        docNums.add(line);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
            }
//        System.out.println(docNums);
        ArrayList<String> docForVal = new ArrayList<>(docNums);
        for (String s : docForVal){
            if (!(s.startsWith("docnum") || s.startsWith("contract")) || s.length() != 15){
                map.put(s, " Invalid");
            }
            else{
                map.put(s, " Valid");
            }
        }

        //прохождение по циклу и записывание в отчет
        //        map.forEach(
//                (key, value) -> System.out.println(key+ "="+value));

        for (Map.Entry<String, String> set :
                map.entrySet()) {
            System.out.println(set.getKey() + " = "
                    + set.getValue());
        }
        try {
            FileWriter writer = new FileWriter(report);
            writer.write(String.valueOf(map));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();

        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
    }


//        BufferedReader bF = new BufferedReader(new InputStreamReader(System.in));
//        String str = null;
//        System.out.println("Введите имя документа");
//        System.out.println("Введите 'стоп' для завершения");
//
//        do{
//            try {
//                str = bF.readLine();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//
//        }while(!str.equals("стоп"));
//        System.out.println(str);