package characters.base;

public abstract class Character implements ICharacter {
    protected String name;
    protected int health;
    protected int strength;
    protected int agility;
    protected int intelligence;
    protected int armor;
    protected int damage;
    protected int mana;
    protected int level;

    Place position;

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
}
