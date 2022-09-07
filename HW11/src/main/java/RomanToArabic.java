public class RomanToArabic implements Roman {

    private String roman;

    public RomanToArabic(String roman) {
        this.roman = roman;
        System.out.println(getArabic());
    }

    public int romanToArabic(String roman) {
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
            default -> 0;
        };
    }

    @Override
    public void setRoman(String romanian) {
        roman = romanian;
    }

    @Override
    public String getRoman() {
        return roman;
    }

    @Override
    public int getArabic() {
        return romanToArabic(roman);
    }
}
