package commands;

import data.SpaceMarine;

import java.util.LinkedList;

/**
 * Абстрактный класс, от которого наследуются классы команд
 */
public abstract class CommandAbstract {
    protected String name;
    protected String help;

    /**
     * Метод выполнения команды
     *
     * @param args            аргументы, принимаемые командой
     * @param list   коллекция, с которой работает пользователь
     * @param commandManager объект класса CommandsManager
     */
    public abstract void execute(String args[], LinkedList<SpaceMarine> list, CommandManager commandManager);

    public String getName() {
        return name;
    }

    public String getHelp() {
        return help;
    }
}
