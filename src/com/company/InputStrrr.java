package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputStrrr {




        public static void main(String[] args) throws Exception
        {

            //Создаем поток-чтения-байт-из-файла
            FileInputStream inputStream = new FileInputStream("src/com/company/test.txt");
            // Создаем поток-записи-байт-в-файл
            FileOutputStream outputStream = new FileOutputStream("src/com/company/testWr.txt");

            byte[] buffer = new byte[1000];
            while (inputStream.available() > 0) //пока есть еще непрочитанные байты
            {
                // прочитать очередной блок байт в переменную buffer и реальное количество в count
                int count = inputStream.read(buffer);
                outputStream.write(buffer, 0, count); //записать блок(часть блока) во второй поток
            }

            inputStream.close(); //закрываем оба потока. Они больше не нужны.
            outputStream.close();
        }

    }


