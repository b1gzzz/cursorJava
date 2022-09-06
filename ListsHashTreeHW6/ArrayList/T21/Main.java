package T21;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> rainbow = new ArrayList<>(4);

        rainbow.add("blue");
        rainbow.add("purple");
        rainbow.add("green");
        rainbow.add("other colors");

        rainbow.set(1, "red");

        System.out.println("New color in array list: " + rainbow);

    }
}
