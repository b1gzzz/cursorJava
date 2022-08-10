package T2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> rainbow = new ArrayList<>();

        rainbow.add("blue");
        rainbow.add("purple");
        rainbow.add("green");
        rainbow.add("other colors");

        for (int i = 0; i < rainbow.size(); i++){
            System.out.println(rainbow.get(i));
        }
    }
}
