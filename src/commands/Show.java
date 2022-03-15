package commands;

import data.SpaceMarine;
import utilities.Decoder;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Класс команды show
 */
public class Show extends CommandAbstract{
    public Show() {
        name = "show";
        help = "выводит информацию об объектах коллекции";
    }

    /**
     * Выводит информацию об объектах коллекции
     * @param args            аргументы, принимаемые командой
     * @param list   коллекция, с которой работает пользователь
     * @param commandManager объект класса CommandsManager
     */
    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager) {
        if (Decoder.list.size() == 0) {
            System.out.println("Коллекция пуста");
        } else System.out.println(Arrays.toString(Decoder.list.toArray()));
    }
}
