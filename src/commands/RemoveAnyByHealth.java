package commands;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import data.SpaceMarine;
import utilities.Decoder;

import java.util.LinkedList;

public class RemoveAnyByHealth extends CommandAbstract {
    public RemoveAnyByHealth() {
        name = "remove_any_by_health";
        help = "удаляет из коллекции один элемент, значение поля loyal которого эквивалентно заданному";
    }

    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager){
        if (args.length != 1) System.out.println("Неверный health");
        else{
            try {
                boolean exist = false;
                for (SpaceMarine marine : Decoder.list) {
                    if (Long.parseLong(args[0]) == marine.getHealth()){
                        System.out.println("Элемент со значением health " + marine.getHealth() + " удален");
                        Decoder.list.remove(marine);
                        exist = true;
                        break;
                    }
                }
                if (!exist){
                    System.out.println("В коллекции нет элемента с указанным health");
                }
            }catch(Exception e){
                System.out.println("Коллекция пустая");
            }
        }
    }

}
