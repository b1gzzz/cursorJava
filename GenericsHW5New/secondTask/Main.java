package secondTask;

public class Main {
    public static void main(String[] args) {
        MyListComparable<Integer> listInt = new MyListComparable<>();
        listInt.add(45);
        listInt.add(62);
        listInt.add(2);
        listInt.add(-98);
        listInt.add(0);

        for (int i = 0; i < listInt.list.size(); i++) {
            System.out.println(listInt.list.get(i));
        }

        MyListComparable<String> string = new MyListComparable<>();
        string.add("Example string");
        string.add("New example string");
        string.add("Random words");
        string.add("Random strings");

        for (int i = 0; i < string.list.size(); i++) {
            System.out.println(string.list.get(i));
        }

    }
}
