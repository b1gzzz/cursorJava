package MaximumOfTwoT1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // 1)Max of two integers arguments.
        List<Integer> integerList = Stream.of(10, -9).toList();
        Integer maxInt = integerList.stream()
                .max(Comparator.comparing(integer -> integer))
                        .get();
        System.out.println("Max number: " + maxInt);
    }
}
