package character.abstractions;

import character.interfaces.Attackable;

public abstract class Character implements Attackable {
    private String name;
    private int agility;
    private int health;
    private int experience;
    private int strength;
    private int gold;

    public Character(String name, int agility, int strength) {
        this.name = name;
        this.agility = agility;
        this.strength = strength;

        health = 100;
        experience = 0;
        gold = 0;
    }
}
