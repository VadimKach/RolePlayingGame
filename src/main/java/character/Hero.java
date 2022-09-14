package character;

import character.abstractions.Person;
import character.interfaces.Attackable;

public class Hero extends Person implements Attackable {

    public Hero(String name, int agility, int strength) {
        super(name, agility, strength);
    }

    @Override
    public void attack() {

    }
}
