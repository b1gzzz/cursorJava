public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Adapter:");
        RomanNubmer romanNubmer = new RomanNubmer("C");
        Number adapter = new Adapter(romanNubmer);
        System.out.println(adapter.getNumber());

        System.out.println("Proxy:");
        System.out.println("Wait please ...");

        //some delay for client

        Thread.sleep(2000);
        Roman roman = new Proxy("III");
        System.out.println(roman.getRoman());
    }

}
