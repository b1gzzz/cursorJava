package T4;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> units = new HashSet<>();

        units.add("Paladin");
        units.add("Archmage");
        units.add("Mountain King");
        units.add("Blood Mage");

        // that seems I can use units.clear() as well
        units.removeAll(units);
        System.out.println("No units in my hash set: " + units);
    }
}
