package MultiplyingT3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // 3)Production of all numbers in the range.
        Stream<Integer> ints = Stream.of(1,2,3,4,5,6,7,8);
        Optional<Integer> multiply = ints.reduce((x,y) -> x*y);
        System.out.println(multiply.get());
    }
}
