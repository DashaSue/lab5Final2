package commands;

import data.SpaceMarine;
import utilities.Decoder;

import java.util.LinkedList;

public class Clear extends CommandAbstract {
    public Clear() {
        name = "clear";
        help = "очищает коллекцию";
    }

    /**
     * Удаляет все элементы коллекции
     *
     * @param args            не принимает аргументы
     * @param list   коллекция, которую нужно очистить
     * @param commandsManager объект класса CommandsManager
     */
    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandsManager) {
        if (Decoder.list.size() == 0) System.out.println("Команда не принимает аргументы");
        else {
            Decoder.list.clear();
            System.out.println("Коллекция очищена");
        }
    }
}

