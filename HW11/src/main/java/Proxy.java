public class Proxy implements Roman {

    private final String roman;
    private RomanToArabic proxy;

    public Proxy(String roman) {
        this.roman = roman;
    }

    @Override
    public void setRoman(String string) {
        if (proxy == null) {
            proxy = new RomanToArabic(roman);
        }
        proxy.setRoman(string);
    }

    @Override
    public String getRoman() {
        if (proxy == null) {
            proxy = new RomanToArabic(roman);
        }
        return proxy.getRoman();
    }

    @Override
    public int getArabic() {
        if (proxy == null) {
            proxy = new RomanToArabic(roman);
        }
        return proxy.getArabic();
    }
}
