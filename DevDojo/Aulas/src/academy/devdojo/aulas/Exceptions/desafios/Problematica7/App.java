package academy.devdojo.aulas.Exceptions.desafios.Problematica7;

import academy.devdojo.aulas.Exceptions.desafios.Problematica7.Entities.Task;
import academy.devdojo.aulas.Exceptions.desafios.Problematica7.Exceptions.InvalidPriorityException;

public class App {
    public static void main(String[] args) {
        try {
            Task task01 = new Task("Study JAVA", 5);
            System.out.println(task01);
            Task task02 = new Task("Cook meals", 4);
            System.out.println(task02);
            Task task03 = new Task("Go to gym", 3);
            System.out.println(task03);
            Task task04 = new Task("Read 10 pages", 2);
            System.out.println(task04);
            Task task05 = new Task("Sleep", 1);
            System.out.println(task05);
            Task task06 = new Task("Feed cats", 0);
            System.out.println(task06);
            Task task07 = new Task("Play CS", 6);
            System.out.println(task07);
        }catch (InvalidPriorityException e){
            e.printStackTrace();
        }
    }
}
