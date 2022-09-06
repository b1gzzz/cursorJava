package T5;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<String> treeUnits = new TreeSet<>();
        treeUnits.add("Archer");
        treeUnits.add("Huntress");
        treeUnits.add("Wisp");
        treeUnits.add("Glaive Thrower");
        System.out.println("Normal order: " + treeUnits);

        treeUnits.first();
        treeUnits.last();
        System.out.println("First unit: " + treeUnits.first() + "\nLast unit: " + treeUnits.last());
    }
}
