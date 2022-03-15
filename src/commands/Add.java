package commands;

import data.SpaceMarine;
import utilities.Decoder;
import utilities.FileWriter;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Add extends CommandAbstract{
    public Add(){
        name = "add";
        help = "добавляет новый элемент в коллекцию";
    }

    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager) {
        String a = "ввод с консоли";
        FileWriter.fileWriter(a);
        Decoder.fillCollection(a);
    }
}
