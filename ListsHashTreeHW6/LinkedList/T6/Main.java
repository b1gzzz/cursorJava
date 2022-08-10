package T6;

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

        System.out.println("Primary list: " + units);

        units.addFirst("Mortar Team");
        units.addLast("Siege Engine");
        System.out.println("Modified list: " + units);
    }
}
