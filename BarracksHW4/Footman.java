package barracks;

public class Footman extends Unit {

    private static final String ARMOR = "medium armor";

    public Footman(String name) {
        super(name);
    }

    @Override
    public void fight() {
        System.out.println("My sword leads me!");
    }

    @Override
    public void go() {
        System.out.println("My movement speed is very slow :(");
    }

    @Override
    public void saySmth() {
        System.out.println("I'm footman!");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String armorType() {
        return ARMOR;
    }
}
