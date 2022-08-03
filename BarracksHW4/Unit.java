package barracks;

public abstract class Unit implements Nameable, Armorable {

    protected String name;

    public Unit(String name) {
        this.name = name;
    }

    public abstract void fight();

    public abstract void go();

    public abstract void saySmth();

}
