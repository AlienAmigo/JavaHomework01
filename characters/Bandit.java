package characters;

public class Bandit extends Character {
  public Bandit() {
    this.name = "Бандит";
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
