package T15;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Integer> firstInt = new TreeSet<>();
        firstInt.add(0);
        firstInt.add(2);
        firstInt.add(3);
        firstInt.add(-1);
        firstInt.add(5);
        firstInt.add(23);
        firstInt.add(98);
        firstInt.add(82);
        firstInt.add(34);

        System.out.println("Removed last: " + firstInt.pollLast());
        System.out.println("Without last integer: " + firstInt);
    }
}
