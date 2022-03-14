package commands;

import data.SpaceMarine;
import utilities.Decoder;

import java.util.LinkedList;

public class Info extends CommandAbstract{
    public Info() {
        name = "info";
        help = "выводит информацию о коллекции";
    }

    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager) {
        if (args.length > 0) System.out.println("Команда не принимает аргументы");
        else {
            System.out.println("Тип коллекции: " + list.getClass().getName());
            System.out.println("Время создания коллекции: " + SpaceMarine.getCreationDate());
            System.out.println("Количество элементов в коллеции: " + Decoder.list.size());
        }
    }
}
