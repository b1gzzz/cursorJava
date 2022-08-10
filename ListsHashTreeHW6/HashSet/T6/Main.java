package T6;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> units = new HashSet<>();

        units.add("Paladin");
        units.add("Archmage");
        units.add("Mountain King");
        units.add("Blood Mage");

        HashSet<String> unitsCloned = (HashSet<String>) units.clone();
        System.out.println("Cloned hash set: " + unitsCloned);
    }
}
