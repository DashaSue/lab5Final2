package commands;

import data.SpaceMarine;

import java.util.LinkedList;

public class RemoveFirst extends CommandAbstract{
    public RemoveFirst(){
        name = "remove_first";
        help = "удаляет первый элемент коллекции";
    }
    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager){
        if (args.length > 0) System.out.println("Команда не принимает аргументы");
        else{
            try{
                System.out.println("Первый элемент с id" + list.poll().getId() + "удален");
            }catch(Exception e){
                System.out.println("Коллекция пустая");
            }
        }
    }
}
