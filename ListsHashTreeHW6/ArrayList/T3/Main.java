package T3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> rainbow = new ArrayList<>();

        rainbow.add("blue");
        rainbow.add("purple");
        rainbow.add("green");
        rainbow.add("other colors");
        rainbow.add(0, "orange");
        System.out.println(rainbow);

    }
}
