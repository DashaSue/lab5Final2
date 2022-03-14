package utilities;

import data.*;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FileReader {
    public static List<String> fileLines = new LinkedList<>();

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
