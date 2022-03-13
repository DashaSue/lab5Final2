package commands;

import data.SpaceMarine;

import java.util.LinkedList;

public class Info extends CommandAbstract{
    public Info() {
        name = "info";
        help = "выводит в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)";
    }

    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager) {
        if (args.length > 0) System.out.println("Команда не принимает аргументы");
        else {
            System.out.println("Тип коллекции: " + list.getClass().getName());
            System.out.println("Время создания коллекции: " + "");
            System.out.println("Количество элементов в коллеции: " + list.size());
        }
    }
}
