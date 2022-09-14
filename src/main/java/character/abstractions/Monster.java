package character.abstractions;

import character.interfaces.Attackable;

public abstract class Monster extends Character  implements Attackable {
    public Monster(String name, int agility, int strength) {
        super(name, agility, strength);
    }
}
