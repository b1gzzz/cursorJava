package T2;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<String> treeUnits = new TreeSet<>();
        treeUnits.add("Archer");
        treeUnits.add("Huntress");
        treeUnits.add("Wisp");
        treeUnits.add("Glaive Thrower");

        Iterator<String> iterator = treeUnits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
