package commands;

import data.SpaceMarine;

import java.util.LinkedList;

public class Exit extends CommandAbstract{
    public void Exit(){
        name = "exit";
        help = "завершает программу (без сохранения в файл)";
    }

    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager){
            if (args.length >0) System.out.println("Команда не принимает аргументы");
            else {
                System.exit(0);
            }

        }
}
