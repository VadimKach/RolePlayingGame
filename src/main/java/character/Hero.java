package character;

import character.abstractions.Person;

public class Hero extends Person {

    public Hero(String name, int agility, int strenght) {
        super(name, agility, strenght);
    }

    @Override
    public void attack() {

    }
}
