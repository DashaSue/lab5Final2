package commands;

import com.sun.deploy.net.MessageHeader;
import data.SpaceMarine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Класс выбора команд
 */
public class CommandManager {
    private static HashSet<CommandAbstract> commands = new HashSet<>();
    private static CommandManager commandManager = new CommandManager();
    protected static ArrayList historyList = new ArrayList();

    /**
     * Конструктор, при вызове которого в коллекцию HashSet commands будут добавлены все доступные команды
     */
    private CommandManager() {
        commands.add(new Help());
        commands.add(new Info());
        commands.add(new ExecuteScript());
        commands.add(new Clear());
        commands.add(new Show());
        commands.add(new Exit());
        commands.add(new RemoveFirst());
        commands.add(new RemoveById());
        commands.add(new RemoveAnyByHealth());
        commands.add(new RemoveQreater());
        commands.add(new Save());
        commands.add(new History());
        commands.add(new Add());
    }

    public static HashSet<CommandAbstract> getCommands() {
        return commands;
    }


    private boolean exist = false;
    private boolean notPrintAdd = false;
    private String scriptFileName = "executeScript.csv";
    private boolean isScript = false;
    private InputStreamReader scriptInputReader;

    /**
     * Метод, который определяет, какую команду ввели
     *
     * @param args команда с её аргументами
     * @param list коллекция, с которой работает пользователь
     */
    public static void ExecuteCommand(String[] args, LinkedList<SpaceMarine> list) {
        String cmd = args[0].trim();//удаляет пробелы из начала и конца строки
        args = Arrays.copyOfRange(args, 1, args.length);
        boolean exist = false;
        for (CommandAbstract command : commands)
            if (command.getName().equals(cmd)) {
                command.execute(args, list, commandManager);
                CommandManager.historyList.add(cmd);
                while (CommandManager.historyList.size() > 9) CommandManager.historyList.remove(0);
                exist = true;
            }
        if (!exist) System.out.println("Команда не найдена. Для просмотра доступных команд введите help");
    }
}
