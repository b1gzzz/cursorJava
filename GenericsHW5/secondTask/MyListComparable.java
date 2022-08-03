package secondTask;

import java.util.ArrayList;
import java.util.List;

public class MyListComparable<T extends Comparable<T>> {

        public List<T> list = new ArrayList<>();

        public void add(T a) {
            list.add(0, a);
        }

        public T getGreatest() {
            T greatest = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (greatest.compareTo(list.get(i)) < 0) {
                    greatest = list.get(i);
                }
            }
            return greatest;
        }

        public T getSmallest() {
            T smallest = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (smallest.compareTo(list.get(i)) > 0) {
                    smallest = list.get(i);
                }
            }
            return smallest;
        }

}
