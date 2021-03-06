package utilities;

import data.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static utilities.FileReader.fileLines;

/**
 * Класс типа Decoder
 */
public class Decoder {

    public static List<SpaceMarine> list;
    private static final String envPath = System.getenv("file");

    /**
     * Метод fillCollection, который заполняет коллекцию
     * @param args
     */

    public static void fillCollection(String args){
        if (args == null)
            System.out.println("Указанный файл не найден. Коллекция пустая.");
        else {
            try {
                list = new LinkedList<SpaceMarine>();
                // List<String> fileLines = Files.readAllLines(Paths.get(args));
                if (args!= "ввод с консоли") FileReader.fileReader(args);
                for (String params : fileLines) {
                    String[] splitedText = params.split(": ");
                    ArrayList<String> columnList = new ArrayList<>();
                    for (String s : splitedText) {
                        //Если колонка начинается на кавычки или заканчиваеться на кавычки
                        if (IsColumnPart(s)) {
                            String lastText = columnList.get(columnList.size() - 1);
                            columnList.set(columnList.size() - 1, lastText + ": " + s);
                        } else {
                            columnList.add(s);
                        }
                    }
                    SpaceMarine marine = new SpaceMarine();
                    marine.id = Integer.parseInt(columnList.get(0));
                    marine.name = columnList.get(1);
                    Coordinates coordinates = new Coordinates();
                    coordinates.setX(Double.parseDouble(columnList.get(2)));
                    coordinates.setY(Long.parseLong(columnList.get(3)));
                    marine.coordinates = coordinates;
                    marine.health = Long.parseLong(columnList.get(4));
                    marine.achievements = columnList.get(5);
                    marine.category = AstartesCategory.valueOf(columnList.get(6).toUpperCase());
                    marine.weaponType = Weapon.valueOf(columnList.get(7).toUpperCase());
                    Chapter chapter = new Chapter();
                    chapter.setName(columnList.get(8));
                    chapter.setParentLegion(columnList.get(9));
                    chapter.setMarinesCount(Long.parseLong(columnList.get(10)));
                    marine.chapter = chapter;

                    list.add(marine);
                }
                System.out.println("Коллекция успешно заполнена.");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Некоррректные данные. Коллекция пустая.");
            }
        }
    }

    /**
     * Проверка является ли колонка частью предыдущей колонки
     */
    private static boolean IsColumnPart(String text) {
        String trimText = text.trim();
        //Если в тексте одна ковычка и текст на нее заканчиваеться значит это часть предыдущей колонки
        return trimText.indexOf("\"") == trimText.lastIndexOf("\"") && trimText.endsWith("\"");
    }

    public static String getFilePath(){
        return envPath;
    }

}
