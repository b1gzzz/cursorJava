package T4;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<String> treeUnits = new TreeSet<>();
        treeUnits.add("Archer");
        treeUnits.add("Huntress");
        treeUnits.add("Wisp");
        treeUnits.add("Glaive Thrower");

        System.out.println("Normal order: " + treeUnits);
        Iterator<String> iterator = treeUnits.descendingIterator();
        System.out.println("Units in reverse order: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
