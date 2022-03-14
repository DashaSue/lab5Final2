package commands;

import data.SpaceMarine;

import java.util.ArrayList;
import java.util.LinkedList;

public class History extends CommandAbstract {

    public History() {
        name = "history";
        help = "выводит список последних 9 команд";
    }

    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager) {
        try {
            ArrayList hl = CommandManager.historyList;
            while (hl.size() > 9) hl.remove(0);
            System.out.println("Список последних команд: "+hl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
