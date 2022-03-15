package commands;

import data.SpaceMarine;

import java.util.LinkedList;

/**
 * Класс команды help
 */
public class Help extends CommandAbstract{
    public Help() {
        name = "help";
        help = "выводит справку по доступным командам";
    }

    /**
     * Выводит справку по командам, которые доступны
     * @param args            аргументы, принимаемые командой
     * @param list   коллекция, с которой работает пользователь
     * @param commandManager объект класса CommandsManager
     */
    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager) {
        if (args.length > 0) {
            System.out.println("На данном этапе команда не принимает аргументы");
        } else
            for (CommandAbstract command : commandManager.getCommands())
                System.out.println("Команда " + command.getName() + ": " + command.getHelp());
    }

}
