package IsPrimeT4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        // 4)Checking if a number is prime.
        List<Integer> intList = Arrays.asList(20, 23, 11, 44, 13, 17);
        List<Integer> ints = intList.stream()
                .filter(n -> prime(n)).toList();
        if (ints.isEmpty()) {
            System.out.println("No primes :(");
        } else {
            System.out.println("Prime int: " + ints);
        }
    }

    //check if number is prime
    static boolean prime(int n) {
        return IntStream.rangeClosed(2, n - 1).noneMatch(i -> n %i == 0);
    }
}
