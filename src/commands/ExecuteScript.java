package commands;

import data.SpaceMarine;

import java.io.*;
import java.util.HashSet;
import java.util.LinkedList;

public class ExecuteScript extends CommandAbstract{
    HashSet<String> scriptsNames = new HashSet<>();

    public ExecuteScript() {
        name = "execute_script";
        help = "Запускает исполняемый скрипт";
    }

    /**
     * Исполняет указанный скрипт
     *
     * @param args            имя скрипта
     * @param list   коллекция, с которой работает пользователь
     * @param commandManager объект класса CommandManager
     */
    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager) {
        if (args.length == 0) System.out.println("вы забыли ввести имя файла со скриптом");
        else if (args.length > 1) System.out.println("неверный формат названия файла");
        else {
            commandManager.setScript(true);
            try {
                String sfn = args[0];
                commandManager.setScriptFileName(sfn);
                commandManager.setScriptInputReader(new InputStreamReader(new FileInputStream(commandManager.getScriptFileName())));
                String line = "";
                while (true) {
                    line = String.valueOf(commandManager.getScriptInputReader().read());
                    String[] nargs = line.split(" ");
                    if (nargs[0].equals("execute_script")) {
                        if (!scriptsNames.contains(nargs[1])) {
                            scriptsNames.add(sfn);
                            CommandManager.ExecuteCommand(nargs, list);
                        } else {
                            System.out.println("Вы не можете выполнить команду в исполняемом скрипте, которая вызывает исполняемый скрипт, содержащий команду вызова другого исполняемого скрипта, который уже исполнялся ранее");
                            System.out.println("Не удалось выполнить: execute_script " + sfn + ". Запущенные скрипты: " + scriptsNames);
                        }
                    }
                    scriptsNames.add(sfn);
                }
            } catch (NullPointerException ignored) {
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        commandManager.setScript(false);
        scriptsNames.clear();
    }
}

