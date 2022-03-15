import commands.CommandManager;
import data.SpaceMarine;
import utilities.Decoder;

import java.util.*;

/**
 * Класс Main
 */
public class Main {
    public static Date creationDate;

    public static void main(String[] args) {
        LinkedList<SpaceMarine> list = new LinkedList<>();
        creationDate = new Date();
       // Decoder.fillCollection("filecsv.csv");
        Decoder.fillCollection(Decoder.getFilePath()); //для переменной окружения
        System.out.println(Decoder.list);

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Приложение готово к работе,введите команду");
            while (true) {
                System.out.print("- ");
                CommandManager.ExecuteCommand(scanner.nextLine().split(" "), list);
            }
        }catch (NoSuchElementException ignored){}
    }
}
