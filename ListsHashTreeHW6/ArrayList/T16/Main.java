package T16;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> rainbow = new ArrayList<>();

        rainbow.add("blue");
        rainbow.add("purple");
        rainbow.add("green");
        rainbow.add("other colors");

        System.out.println("First list: " + rainbow);

       ArrayList<String> rainbowSecond = (ArrayList<String>)rainbow.clone();
        System.out.println("Cloned list: " + rainbowSecond);

    }
}
