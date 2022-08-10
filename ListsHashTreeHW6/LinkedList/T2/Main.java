package T2;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> units = new LinkedList<>();

        units.add("Priest");
        units.add("Sorceress");
        units.add("Spell breaker");

        for (int i = 0; i < units.size(); i++) {
            System.out.println(units.get(i));
        }

    }
}
