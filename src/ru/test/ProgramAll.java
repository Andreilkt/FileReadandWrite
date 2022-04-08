package ru.test;

import java.io.*;

public class ProgramAll {

    public static void main(String[] args) {

        try (InputStream fin = new FileInputStream("src/com/company/test.txt");
             OutputStream fos = new FileOutputStream("src/com/company/testWr.txt")) {
            byte[] buffer = new byte[fin.available()];
            // считываем буфер
            int read = (byte) fin.read(buffer, 0, buffer.length);
            while (read > 0) {
                if (buffer.equals("  сценарий")) {
                    System.out.println(buffer);
                }
                // записываем из буфера в файл
                fos.write(buffer, 0, buffer.length);
                --read;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }


}