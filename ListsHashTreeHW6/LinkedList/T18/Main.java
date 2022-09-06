package T18;


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

        LinkedList<String> unitsCloned = (LinkedList<String>)units.clone();

        System.out.println("Cloned list: " + unitsCloned);

    }
}
