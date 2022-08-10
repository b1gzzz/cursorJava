package T3;

import java.util.Collections;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<String> treeUnits = new TreeSet<>();
        treeUnits.add("Archer");
        treeUnits.add("Huntress");
        treeUnits.add("Wisp");
        treeUnits.add("Glaive Thrower");

        TreeSet<String> treeUnitsMore = new TreeSet<>();
        treeUnits.add("Dryad");
        treeUnits.add("Mountain Giant");
        treeUnits.add("Druid of the Claw");
        treeUnits.add("Hippogryph");

        treeUnits.addAll(treeUnitsMore);
        System.out.println("Much more units now: " + treeUnits);
    }
}
