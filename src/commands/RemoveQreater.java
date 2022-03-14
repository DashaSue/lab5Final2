package commands;

import data.SpaceMarine;
import utilities.Decoder;


import java.util.LinkedList;

    public class RemoveQreater extends CommandAbstract{
        public RemoveQreater(){
            name = "remove_qreater";
            help = "удаляет из коллекции все элементы, превышающие заданный по id\n";
        }
        @Override
        public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager){
            if (args.length != 1) System.out.println("Неверный id");
            else{
                try {
                    boolean exist = false;
                    for (SpaceMarine marine : Decoder.list) {
                        if (Integer.parseInt(args[0]) < marine.getId()){
                            System.out.println("Элемент с id " + marine.getId() + " удален");
                            Decoder.list.remove(marine);
                            exist = true;
                        }
                    }
                    if (!exist){
                        System.out.println("В коллекции нет элементов с id больше заданного");
                    }
                }catch(Exception e){
                    System.out.println("Коллекция пустая");
                }
            }
        }
    }

