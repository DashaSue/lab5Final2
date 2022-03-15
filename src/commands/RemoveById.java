package commands;

import data.SpaceMarine;
import utilities.Decoder;


import java.util.LinkedList;

/**
 * Класс команды remove_by_id
 */
public class RemoveById extends CommandAbstract{
    public RemoveById(){
        name = "remove_by_id";
        help = "удаляет элемент с заданным id";
    }

    /**
     * Удаляет элемент с заданным id
     * @param args            аргументы, принимаемые командой
     * @param list   коллекция, с которой работает пользователь
     * @param commandManager объект класса CommandsManager
     */
    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager){
        if (args.length != 1) System.out.println("Неверный id");
        else{
            try {
                boolean exist = false;
                for (SpaceMarine marine : Decoder.list) {
                    if (Integer.parseInt(args[0]) == marine.getId()){
                        System.out.println("Элемент с id " + marine.getId() + " удален");
                        Decoder.list.remove(marine);
                        exist = true;
                        break;
                    }
                }
                if (!exist){
                    System.out.println("В коллекции нет элемента с указанным id");
                }
            }catch(Exception e){
                System.out.println("Коллекция пустая");
            }
        }
    }
}
