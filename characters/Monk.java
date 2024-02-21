package characters;

import characters.base.Character;

public class Monk extends Character {
  public Monk(String name, int x, int y) {
    super(100, 60, 60, 70, 10, 60, 50, 1, name, x, y);
  }

  @Override
  public void attack() {
    System.out.println("Монах атакует...");
  }

  @Override
  public void heal() {
    System.out.println("Монах лечится...");
  }

  @Override
  public void go() {
    System.out.println("Монах идёт...");
  }

  @Override
  public void die() {
    System.out.println("Монах умер...");
  }

  @Override
  public String toString() {
    return this.name;
  }
}
