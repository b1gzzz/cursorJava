package T22;

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

        if (units.contains("Water Elemental")) {
            System.out.println("Yes, I have such unit");
        }
        else {
            System.out.println("No, I don't have it");
        }

    }
}
