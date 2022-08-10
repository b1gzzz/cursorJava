package T10;

import java.util.Collections;
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

      // I'm not  quite sure if need this string HashSet<String> compare = new HashSet<>();
        for (String s : units) {
            System.out.println(moreUnits.contains(s) ? "Yes" : "No");
        }



    }
}
