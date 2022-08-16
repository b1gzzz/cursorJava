package FactorialT5;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // 5)Calculating a factorial
        int i  = 7;
        int result;
        result = factorial(i);
        System.out.println(result);     //more options to change argument of function "result"
      //  System.out.println(factorial(7)); this one looks easier, but argument may be changed only manually
    }

    public static int factorial(int n) {
        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }
}
