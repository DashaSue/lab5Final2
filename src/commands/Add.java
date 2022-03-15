package commands;

import data.SpaceMarine;
import utilities.Decoder;
import utilities.FileWriter;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Класс команды add
 */
public class Add extends CommandAbstract{
    public Add(){
        name = "add";
        help = "добавляет новый элемент в коллекцию";
    }
//что
    /**
     * Добавляет новый элемент в коллекцию
     * @param args            аргументы, принимаемые командой
     * @param list   коллекция, с которой работает пользователь
     * @param commandManager объект класса CommandsManager
     */
    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager) {
        String a = "ввод с консоли";
        FileWriter.fileWriter(a);
        Decoder.fillCollection(a);
    }
}
