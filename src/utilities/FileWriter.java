package utilities;

import data.SpaceMarine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static utilities.FileReader.fileLines;

public class FileWriter {

    public static void fileWriter(String args){
        Scanner scanner = new Scanner(System.in);
        String s = new String();
        boolean flag = true;
        while (flag){
            System.out.println("Введите id");
            s=s+scanner.nextLine().trim()+": ";
            System.out.println("Введите имя");
            s=s+scanner.nextLine().trim()+": ";
            System.out.println("Введите координату X");
            s=s+scanner.nextLine().trim()+": ";
            System.out.println("Введите координату Y");
            s=s+scanner.nextLine().trim()+": ";
            System.out.println("Введите здоровье");
            s=s+scanner.nextLine().trim()+": ";
            System.out.println("Введите достижения");
            s=s+scanner.nextLine().trim()+": ";
            System.out.println("Введите категорию");
            s=s+scanner.nextLine().trim()+": ";
            System.out.println("Введите тип оружия");
            s=s+scanner.nextLine().trim()+": ";
            System.out.println("Введите имя части");
            s=s+scanner.nextLine().trim()+": ";
            System.out.println("Введите легион части");
            s=s+scanner.nextLine().trim()+": ";
            System.out.println("Введите кол-во кораблей в части");
            s=s+scanner.nextLine().trim()+": ";
            flag = false;
            fileLines.add(s);
        }
        System.out.println(fileLines);


    }


}
