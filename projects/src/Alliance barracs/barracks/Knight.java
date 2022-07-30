package barracks;

public class Knight extends Unit {

    private static final String ARMOR = "heavy armor";

    public Knight(String name) {
        super(name);
    }

    @Override
    public void fight() {
        System.out.println("My horse is amazing!");
    }

    @Override
    public void go() {
        System.out.println("I move faster than my fellows!");
    }

    @Override
    public void saySmth() {
        System.out.println("I'm brave knight!");
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
