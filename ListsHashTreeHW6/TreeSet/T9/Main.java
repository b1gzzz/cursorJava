package T9;

import java.util.Iterator;
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
        firstInt.add(8);
        firstInt.add(34);

        TreeSet<Integer> treeHead = (TreeSet<Integer>) firstInt.headSet(7);

        Iterator<Integer> iterator = treeHead.iterator();

        System.out.println("Tree set numbers:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
