public class Adapter implements Number {

    RomanNubmer romanNubmer;
    private final String roman;

    public Adapter(RomanNubmer romanNubmer) {
        this.romanNubmer = romanNubmer;
        this.roman = romanNubmer.getRoman();
    }

    public int romanToArabic() {
        return switch (roman) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            case "L" -> 50;
            case "C" -> 100;
            default -> -1;
        };
    }

    @Override
    public int getNumber() {
        return romanToArabic();
    }
}
