package T9;

import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        HashSet<String> units = new HashSet<>();

        units.add("Paladin");
        units.add("Archmage");
        units.add("Mountain King");
        units.add("Blood Mage");

        LinkedList<String> unitsLinkedList = new LinkedList<>(units);
        System.out.println("Linked List units: " + unitsLinkedList);
    }
}
