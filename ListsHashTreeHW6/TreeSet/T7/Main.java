package T7;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<String> treeUnits = new TreeSet<>();
        treeUnits.add("Archer");
        treeUnits.add("Huntress");
        treeUnits.add("Wisp");
        treeUnits.add("Glaive Thrower");
        System.out.println("Normal order: " + treeUnits);

        System.out.println("Number of units: " + treeUnits.size());
    }
}
