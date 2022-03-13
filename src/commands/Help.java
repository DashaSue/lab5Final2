package commands;

import data.SpaceMarine;

import java.util.LinkedList;

public class Help extends CommandAbstract{
    public Help() {
        name = "help";
        help = "выводит справку по доступным командам";
    }


    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager) {
        if (args.length > 0) {
            System.out.println("На данном этапе команда не принимает аргументы");
        } else
            for (CommandAbstract command : commandManager.getCommands())
                System.out.println("Команда " + command.getName() + ": " + command.getHelp());
    }

}
