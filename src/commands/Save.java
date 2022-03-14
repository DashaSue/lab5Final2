package commands;

import data.SpaceMarine;
import utilities.Decoder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import com.opencsv.CSVWriter;


public class Save extends CommandAbstract {
    public Save() {
        name = "save";
        help = "сохраняет коллекцию в файл";
    }

    @Override
    public void execute(String[] args, LinkedList<SpaceMarine> list, CommandManager commandManager) {
        if (args.length > 0) System.out.println("Команда не принимает аргументы");
        else {

            try {
                FileWriter filenames = new FileWriter("filecsv.csv");
                CSVWriter writer = new CSVWriter(new FileWriter(String.valueOf(filenames)),
                        ',',
                        '\'',
                        '/',
                        "\n");
                for (SpaceMarine spaceMarine : list)
                writer.writeNext(new String[]{spaceMarine.getName(), String.valueOf(spaceMarine.getCoordinates().getX()),
                        String.valueOf(spaceMarine.getCoordinates().getY()), String.valueOf(spaceMarine.getHealth()),
                        spaceMarine.getAchievements(), String.valueOf(spaceMarine.getCategory()),
                        spaceMarine.getWeaponType().name(), spaceMarine.getChapter().getName(),
                        spaceMarine.getChapter().getParentLegion(), String.valueOf(spaceMarine.getChapter().getMarinesCount())});
                System.out.println("Коллекция успешно сохранена");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
