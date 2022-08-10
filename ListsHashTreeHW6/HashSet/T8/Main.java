package T8;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> units = new HashSet<>();

        units.add("Paladin");
        units.add("Archmage");
        units.add("Mountain King");
        units.add("Blood Mage");

        TreeSet<String> unitsTree = new TreeSet<>(units);
        // tree set is done
        System.out.println("My treeSet units: ");
        for (String s : unitsTree) {
            System.out.println(s);
        }
    }
}
