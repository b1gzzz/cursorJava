package T17;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> units = new LinkedList<>();

        units.add("Priest");
        units.add("Sorceress");
        units.add("Spell breaker");
        units.add("Gryphon Ryder");
        units.add("Dragonhawk Ryder");
        units.add("Flying machine");

        LinkedList<String> moreUnits = new LinkedList<>();

        moreUnits.add("Water Elemental");
        moreUnits.add("Phoenix");

        LinkedList<String> commonList = new LinkedList<>();

        commonList.addAll(units);
        commonList.addAll(moreUnits);
        System.out.println("Bigger list: " + commonList);
    }
}
