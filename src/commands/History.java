package commands;

import data.SpaceMarine;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Класс команды history
 */
public class History extends CommandAbstract {

    public History() {
        name = "history";
        help = "выводит список последних 9 команд";
    }

    /**
     * Выводит список последних 9 команд без их аргументов
     * @param args            аргументы, принимаемые командой
     * @param list   коллекция, с которой работает пользователь
     * @param commandManager объект класса CommandsManager
     */
    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager) {
        try {
            ArrayList hl = CommandManager.historyList;
            System.out.println("Список последних команд: "+hl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
