package commands;

import data.SpaceMarine;

import java.util.LinkedList;

public abstract class CommandAbstract {
    protected String name;
    protected String help;

    public abstract void execute(String args[], LinkedList<SpaceMarine> list, CommandManager commandManager);

    public String getName() {
        return name;
    }

    public String getHelp() {
        return help;
    }
}
