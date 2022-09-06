package T4;

import java.util.Iterator;
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

        Iterator<String> iterator = units.descendingIterator();

        System.out.println("Reversed units list: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
