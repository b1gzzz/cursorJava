package T5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> rainbow = new ArrayList<>();

        rainbow.add("blue");
        rainbow.add("purple");
        rainbow.add("green");
        rainbow.add("other colors");
        rainbow.set(1, "yellow");

        System.out.println(rainbow);

    }
}
