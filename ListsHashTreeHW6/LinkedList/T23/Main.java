package T23;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> units = new LinkedList<>();

        units.add("Priest");
        units.add("Sorceress");
        units.add("Spell breaker");
        units.add("Gryphon Ryder");
        units.add("Dragonhawk Ryder");
        units.add("Flying machine");

        List<String> unitsArray = new ArrayList<>(units);
        for (int i = 0; i < unitsArray.size(); i++) {
            String s = unitsArray.get(i);
            System.out.println(s);
        }
    }
}
