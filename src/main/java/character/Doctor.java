package character;

import character.abstractions.Person;

public class Doctor extends Person {
    private int potion;
    public Doctor(String name, int agility, int strength) {
        super(name, agility, strength);
        potion = 0;
    }

    public void makePotion() {
        potion += 10;
    }

    public int sellPotion(int money) {
        // Курс 1/1
        if ((potion - money) > 0) {
            potion -= money;
            return money;
        } else
            return 0;
    }
}
