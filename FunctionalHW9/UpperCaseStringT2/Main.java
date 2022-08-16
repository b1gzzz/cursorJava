package UpperCaseStringT2;

public class Main {

    public static void main(String[] args) {
        /*
         2)Lambda expression that accepts seven string arguments and returns
         a string in upper case concatenated from all of them.
        */
        UpperCase upperCase = (a, b, c, d, e, f, g) -> (a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g).toUpperCase();
        System.out.println(upperCase.string("red", "orange", "yellow", "green", "blue", "teal", "purple"));
    }
}
