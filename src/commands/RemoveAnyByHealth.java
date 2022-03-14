package commands;

import data.SpaceMarine;

import java.util.LinkedList;

public class RemoveAnyByHealth extends CommandAbstract {
    public void RemoveAnyByHealth() {
        name = "remove_any_by_health";
        help = "удаляет из коллекции один элемент, значение поля loyal которого эквивалентно заданному";
    }

    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager) {
        if (args.length != 1)
            System.out.println("Команда принимает лишь один аргумент");
    }

}
