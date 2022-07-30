package barracks;

public class Rifleman extends Unit {

    private static final String ARMOR = "light armor";

    public Rifleman(String name) {
        super(name);
    }

    @Override
    public void fight() {
        System.out.println("I'm well-aimed!");
    }

    @Override
    public void go() {
        System.out.println("I move faster than footman :)");
    }

    @Override
    public void saySmth() {
        System.out.println("I'm rifleman!");
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
