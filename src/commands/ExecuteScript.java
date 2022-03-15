package commands;

import data.SpaceMarine;
import utilities.FileReader;

import java.io.*;
import java.util.HashSet;
import java.util.LinkedList;

import static utilities.FileReader.fileLines;

public class ExecuteScript extends CommandAbstract {
    HashSet<String> scriptsNames = new HashSet<>();

    public ExecuteScript() {
        name = "execute_script";
        help = "Запускает исполняемый скрипт";
    }

    /**
     * Исполняет указанный скрипт
     *
     * @param args           имя скрипта
     * @param list           коллекция, с которой работает пользователь
     * @param commandManager объект класса CommandManager
     */
    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager) {
        if (args.length == 0) System.out.println("вы забыли ввести имя файла со скриптом");
        else if (args.length > 1) System.out.println("неверный формат названия файла");
        else { FileReader.fileReader(args[0]);
            for (String s : fileLines){
                String[] command = s.split(" ");
                CommandManager.ExecuteCommand(command, list);
            }

        }
    }
}

