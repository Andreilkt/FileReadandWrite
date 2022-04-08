package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileLineByLinenn {
    //public static String line;

    // построчное считывание файла


    public static List<String> FileRd() throws IOException {
        File file = new File("src/com/company/test.txt");
        //создаем объект FileReader для объекта File
        FileReader fr = new FileReader(file);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        // считаем сначала первую строку
        String line = reader.readLine();
        List<String> result = new ArrayList<>();
        while (line != null) {
            //System.out.println(line);
            // считываем остальные строки в цикле
            line = reader.readLine();
            if (line != null && !line.isEmpty() && line.contains("  сценарий")) {
                result.add(line);
                System.out.println(line);
            }
        }
        return result;
    }

    public static void FileWr(List<String> result) {
        String outputFileName = "src/com/company/testWr.txt";
        //String array = line;

        try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {

            for (String l:result)
                  {
                writter.write(l + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}













