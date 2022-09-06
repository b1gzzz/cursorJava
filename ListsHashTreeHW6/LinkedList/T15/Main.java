package T15;

import java.util.Collection;
import java.util.Collections;
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

        Collections.swap(units, 0, 4);
        System.out.println("After swapping: " + units);
    }
}
