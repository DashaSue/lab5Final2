package commands;

import data.SpaceMarine;

import java.util.LinkedList;
/**
 * Класс команды exit
 */
public class Exit extends CommandAbstract{
    public Exit(){
        name = "exit";
        help = "завершает программу (без сохранения в файл)";
    }

    /**
     * Завершает программу без сохранения коллекции в файл
     * @param args            аргументы, принимаемые командой
     * @param list   коллекция, с которой работает пользователь
     * @param commandManager объект класса CommandsManager
     */
    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager){
            if (args.length >0) System.out.println("Команда не принимает аргументы");
            else {
                System.exit(0);
            }

        }
}
