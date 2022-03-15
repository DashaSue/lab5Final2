package utilities;

import data.*;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Класс FileReader
 */
public class FileReader {
    public static List<String> fileLines = new LinkedList<>();

    /**
     * Метод, который считывает данные с файла
     * @param args элементы коллекции
     */
    public static void fileReader(String args) {
        if (args == null)
            System.out.println("Указанный файл не найден. Коллекция пустая.");
        else {
            try {
                BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream(args)));
                String reader = buff.readLine();
                while (reader != null) {
                    fileLines.add(reader);
                    reader = buff.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Некоррректные данные");
            }
        }
    }
}
