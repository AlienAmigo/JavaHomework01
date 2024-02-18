package characters;

public abstract class Character {
    protected int health;
    protected int strength;
    protected int agility;
    protected int intelligence;
    protected int armor;
    protected int damage;
    protected int level;
    protected String name;

    public abstract void attack();

    public abstract void heal();

    public abstract void go();

    public abstract void die();
}
