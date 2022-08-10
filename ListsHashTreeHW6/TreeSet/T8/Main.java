package T8;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<String> treeUnits = new TreeSet<>();
        treeUnits.add("Archer");
        treeUnits.add("Huntress");
        treeUnits.add("Wisp");
        treeUnits.add("Glaive Thrower");
        treeUnits.add("Hippogryph");
        System.out.println("Normal order first set: " + treeUnits);

        TreeSet<String> treeUnitsMore = new TreeSet<>();
        treeUnitsMore.add("Dryad");
        treeUnitsMore.add("Mountain Giant");
        treeUnitsMore.add("Glaive Thrower");
        treeUnitsMore.add("Druid of the Claw");
        treeUnitsMore.add("Hippogryph");
        System.out.println("Normal order second set: " + treeUnitsMore);

        for (String s : treeUnits){
            System.out.println(treeUnitsMore.contains(s) ? "Yes" : "No");
        }
    }
}
