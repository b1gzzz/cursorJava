package T20;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> rainbow = new ArrayList<>(4);

        rainbow.add("blue");
        rainbow.add("purple");
        rainbow.add("green");
        rainbow.add("other colors");

        rainbow.ensureCapacity(6);

        rainbow.add("yellow");
        rainbow.add("red");
        System.out.println("With increased capacity: " + rainbow);

    }
}
