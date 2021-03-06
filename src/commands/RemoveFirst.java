package commands;

import data.SpaceMarine;
import utilities.Decoder;

import java.util.LinkedList;

/**
 * Класс команды remove_first
 */
public class RemoveFirst extends CommandAbstract{
    public RemoveFirst(){
        name = "remove_first";
        help = "удаляет первый элемент коллекции";
    }
    /**
     * Удаляет первый элемент колекции
     */
    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager){
        if (args.length > 0) System.out.println("Команда не принимает аргументы");
        else{
            try{
                System.out.println("Первый элемент с id " + Decoder.list.remove(0).getId() + " удален");
            }catch(Exception e){
                System.out.println("Коллекция пустая");
            }
        }
    }
}
