package characters.base;

import config.ConsoleColors;

import java.util.ArrayList;

public abstract class Character implements ICharacter {
    public String name;
    public Place position;
    protected int health;
    protected int strength;
    protected int agility;
    protected int intelligence;
    protected int armor;
    protected int damage;
    protected int mana;
    protected int level;

    public Character(Integer health, Integer strength, Integer agility, Integer intelligence, Integer armor,
                     Integer damage, Integer mana, Integer level, String name, int x, int y) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.armor = armor;
        this.damage = damage;
        this.mana = mana;
        this.level = level;

        this.position = new Place(x, y);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    private String infoRow(
            String title, String value, boolean linebreak
    ) {
        return ConsoleColors.BLACK_BOLD + title + ConsoleColors.RESET + ": " + value + (linebreak ? "\n" : "");
    }

    public String getFullInfo() {
        return String.format("name: %s\ntype: %s\nhealth: %d\nstrength: %d\nintelligence: %d\nagility: %d\narmor: %d\ndamage: %d\nmana: %d\nlevel: %d\nposition:\nx: %d\ny: %d", this.name, this.getClass().getSimpleName(), this.health, this.strength, this.intelligence, this.agility, this.armor, this.damage, this.mana, this.level, this.position.x, this.position.y);
    }

    public String getShortInfo() {
        return String.format("name: %s\ntype: %s\nposition:\nx: %d\ny: %d", this.name, this.getClass().getSimpleName(), this.position.x, this.position.y);
    }
}
