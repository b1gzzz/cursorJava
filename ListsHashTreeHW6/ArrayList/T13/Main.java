package T13;

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

        ArrayList<String> rainbowTheSame = new ArrayList<>();
        rainbowTheSame.add("blue");
        rainbowTheSame.add("purple");
        rainbowTheSame.add("green");
        rainbowTheSame.add("yellow");
        rainbowTheSame.add("other colors");

        boolean compare = rainbow.equals(rainbowTheSame);
        System.out.println(compare);
    }
}
