package commands;

import data.SpaceMarine;
import utilities.Decoder;

import java.util.LinkedList;

public class RemoveById extends CommandAbstract{
    public RemoveById(){
        name = "remove_by_id";
        help = "удаляет элемент с заданным id";
    }
    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager){
        if (args.length != 1) System.out.println("Неверный id");
        else{
            try{
                System.out.println("Элемент с id " + Decoder.list.remove(Integer.parseInt(args[0]) - 1).getId() + " удален");
            }catch(Exception e){
                System.out.println("Коллекция пустая");
            }
        }
    }
}
