package commands;

import data.SpaceMarine;
import utilities.Decoder;

import java.util.Arrays;
import java.util.LinkedList;

public class Show extends CommandAbstract{
    public Show() {
        name = "show";
        help = "выводит в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)";
    }


    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager) {
        if (Decoder.list.size() == 0) {
            System.out.println("Команда не принимает аргументы");
        } else System.out.println(Arrays.toString(Decoder.list.toArray()));
    }
}
