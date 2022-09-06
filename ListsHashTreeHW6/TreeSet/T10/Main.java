package T10;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Integer> firstInt = new TreeSet<>();
        firstInt.add(0);
        firstInt.add(2);
        firstInt.add(3);
        firstInt.add(44);
        firstInt.add(5);
        firstInt.add(6);
        firstInt.add(98);
        firstInt.add(82);
        firstInt.add(34);

        System.out.println("Greater or equaled than 8: " + firstInt.ceiling(8));
        System.out.println("Greater or equaled than 98: " + firstInt.ceiling(98));
        System.out.println("Greater or equaled than 4: " + firstInt.ceiling(4));
    }
}
