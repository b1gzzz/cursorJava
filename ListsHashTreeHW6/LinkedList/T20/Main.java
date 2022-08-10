package T20;

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

        String peeked = units.peekFirst();
        System.out.println("First unit: " + peeked);
        System.out.println("Primary list: " + units);
    }
}
