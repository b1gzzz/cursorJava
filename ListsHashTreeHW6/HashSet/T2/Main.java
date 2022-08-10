package T2;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        HashSet<String> units = new HashSet<>();

        units.add("Paladin");
        units.add("Archmage");
        units.add("Mountain King");
        units.add("Blood Mage");

        Iterator<String> iterator = units.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
