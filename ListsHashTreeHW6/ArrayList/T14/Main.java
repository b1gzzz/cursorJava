package T14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> rainbow = new ArrayList<>();

        rainbow.add("blue");
        rainbow.add("purple");
        rainbow.add("green");
        rainbow.add("yellow");
        rainbow.add("other colors");

        System.out.println("Before swap: " + "\n" + rainbow.get(0) + "\n" + rainbow.get(3));
        Collections.swap(rainbow, 0, 3);
        System.out.println("After swap: " + "\n" + rainbow.get(0) + "\n" + rainbow.get(3));

    }
}
