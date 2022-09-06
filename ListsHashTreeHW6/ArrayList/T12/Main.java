package T12;

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

        List<String> subRainbow = rainbow.subList(0,2);
        System.out.println("First 2 elements: " + subRainbow);
    }
}
