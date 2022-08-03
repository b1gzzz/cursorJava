package firstTask;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(45);
        list.add(62);
        list.add(123);
        System.out.println("The greatest INT is " + list.getGreatest() + " The smallest INT is " + list.getSmallest());

        //tried the same with float
        MyList<Float> listFloat = new MyList<>();
        listFloat.add(0.2f);
        listFloat.add(0.4f);
        listFloat.add(12.12f);

        System.out.println("The greatest FLOAT is " + listFloat.getGreatest() + " The smallest FLOAT is " + listFloat.getSmallest());
    }
}
