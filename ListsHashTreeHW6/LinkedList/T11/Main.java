package T11;

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

        for (int i = 0; i < units.size(); i++) {
            System.out.println("Unit: " + units.get(i) + "on position: " + i);
        }
    }
}
