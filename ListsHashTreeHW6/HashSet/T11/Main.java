package T11;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> units = new HashSet<>();
        units.add("Paladin");
        units.add("Archmage");
        units.add("Mountain King");
        units.add("Blood Mage");

        HashSet<String> moreUnits = new HashSet<>();
        moreUnits.add("Paladin");
        moreUnits.add("Phoenix");
        moreUnits.add("Water Elemental");

        units.retainAll(moreUnits);
        System.out.println("Retained unit: " + units);
    }
}
