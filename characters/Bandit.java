import characters.util.Character;

public class Bandit extends Character {
  public Bandit(String name, int x, int y) {
    super(100, 60, 40, 30, 25, 60, 1, name, x, y);
  }

  @Override
  public void attack() {
    System.out.println("Бандит атакует!");
  }

  @Override
  public void heal() {
    System.out.println("Бандит лечится!");
  }

  @Override
  public void go() {
    System.out.println("Бандит идёт!");
  }

  @Override
  public void die() {
    System.out.println("Бандит умер!");
  }

  @Override
  public String toString() {
    return this.name;
  }
}
