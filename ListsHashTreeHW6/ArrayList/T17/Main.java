package T17;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> rainbow = new ArrayList<>();

        rainbow.add("blue");
        rainbow.add("purple");
        rainbow.add("green");
        rainbow.add("other colors");
        System.out.println("Not empty list: " + rainbow);

        rainbow.removeAll(rainbow);
        System.out.println("Empty list: " + rainbow);
    }
}
