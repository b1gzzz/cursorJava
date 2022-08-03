package firstTask;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {

        private final List<T> list = new ArrayList<>();

        public void add(T a) {
            list.add(0,a);
        }

        public T getGreatest() {
            T greater = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).floatValue() > greater.floatValue()) {
                    greater = list.get(i);
                }
            }
        return greater;
        }

        public T getSmallest() {
            T smallest = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).floatValue() < smallest.floatValue()) {
                    smallest = list.get(i);
                }
            }
            return smallest;
        }

}
