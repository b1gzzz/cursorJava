package T10;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> units = new LinkedList<>();

        units.add("Priest");
        units.add("Sorceress");
        units.add("Spell breaker");
        units.add("Gryphon Ryder");
        units.add("Dragonhawk Ryder");
        units.add("Flying machine");

        Object first = units.getFirst();
        Object last = units.getLast();
        System.out.println("First unit: " + first + "\nLast unit: " + last);

    }
}
