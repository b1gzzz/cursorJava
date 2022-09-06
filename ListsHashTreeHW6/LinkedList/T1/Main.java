package T1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> units = new LinkedList<>();

        units.add("Priest");
        units.add("Sorceress");
        units.add("Spell breaker");

        System.out.println("Just 3 units: " + units);

        units.addLast("Gryphon Ryder");

        System.out.println("After adding last one: " + units);
    }
}