package T7;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> units = new HashSet<>();

        units.add("Paladin");
        units.add("Archmage");
        units.add("Mountain King");
        units.add("Blood Mage");

        String[] unitsToArray = new String[units.size()];
        units.toArray(unitsToArray);

        System.out.println("Units in array: ");
        for (String unit : unitsToArray) {
            System.out.println(unit);
        }

    }
}
