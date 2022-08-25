package firstTask;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {

        private final List<T> list = new ArrayList<>();

        public void add(T a) {
            list.add(a);
        }

        public T getGreatest() {
            T greater = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).doubleValue() > greater.doubleValue()) {
                    greater = list.get(i);
                }
            }
            return greater;
        }

        public T getSmallest() {
            T smallest = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).doubleValue() < smallest.doubleValue()) {
                    smallest = list.get(i);
                }
            }
            return smallest;
        }

}
