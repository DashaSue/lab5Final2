package commands;

import data.SpaceMarine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class CommandManager {
    private static HashSet<CommandAbstract> commands = new HashSet<>();
    private static CommandManager commandManager = new CommandManager();

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
    }
    public static HashSet<CommandAbstract> getCommands() {
        return commands;
    }


    private boolean exist = false;
    private boolean notPrintAdd = false;
    private String scriptFileName = "executeScript.csv";
    private boolean isScript = false;
    private InputStreamReader scriptInputReader;


    public static void ExecuteCommand(String[] args, LinkedList<SpaceMarine> list) {
        String cmd = args[0].trim();//удаляет пробелы из начала и конца строки
        args = Arrays.copyOfRange(args, 1, args.length);
        boolean exist = false;
        for (CommandAbstract command : commands)
            if (command.getName().equals(cmd)) {
                command.execute(args, list, commandManager);
                exist = true;
            }
        if (!exist) System.out.println("Команда не найдена. Для просмотра доступных команд введите help");
    }
    public void setExist(boolean exist) {
        this.exist = exist;
    }
    public boolean isExist() {
        return exist;
    }
    //методы для скрипта
    public void setScript(boolean b) { isScript = b;}

    public void setScriptFileName(String sfn) {this.scriptFileName = sfn;}

    public String getScriptFileName() {
        return scriptFileName;
    }

    public InputStreamReader getScriptInputReader() {
        return scriptInputReader;
    }

    public void setScriptInputReader(InputStreamReader scriptInputReader) {
        this.scriptInputReader = scriptInputReader;
    }
}
