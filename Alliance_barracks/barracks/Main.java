package barracks;

public class Main {

    public static void main(String[] args) {
        Unit footman = new Footman("Jake");
        Unit rifleman = new Rifleman("Sniper");
        Unit knight = new Knight("Chaos");

        System.out.println("Hi! My name is " + footman.getName() + " and I have " + footman.armorType());
        System.out.println("Here are some facts about me:");
        unitInfo(footman);

        System.out.println("Hi! My name is " + rifleman.getName() + " and I have " + rifleman.armorType());
        System.out.println("Here are some facts about me:");
        unitInfo(rifleman);

        System.out.println("Hi! My name is " + knight.getName() + " and I have " + knight.armorType());
        System.out.println("Here are some facts about me:");
        unitInfo(knight);
    }

    static void unitInfo(Unit unit) {
        unit.saySmth();
        unit.fight();
        unit.go();
    }
}
    