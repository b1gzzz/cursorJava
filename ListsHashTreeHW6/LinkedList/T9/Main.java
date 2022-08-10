package T9;

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

        LinkedList<String> moreUnits = new LinkedList<>();

        moreUnits.add("Mortar Team");
        moreUnits.add("Siege Engine");

        units.addAll(3,moreUnits);
        System.out.println("Expanded list: " + units);

    }
}
