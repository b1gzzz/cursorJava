package T9;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> rainbow = new ArrayList<>();

        rainbow.add("blue");
        rainbow.add("purple");
        rainbow.add("green");
        rainbow.add("other colors");

        System.out.println("First list: " + rainbow);

        ArrayList<String> rainbowSecond = new ArrayList<>();
        rainbowSecond.add("pink");
        rainbowSecond.add("yellow");
        rainbowSecond.add("red");
        rainbowSecond.add("orange");

        System.out.println("Second list: " + rainbowSecond);

        Collections.copy(rainbow, rainbowSecond);
        System.out.println(rainbow + "\n" + rainbowSecond);

    }
}
