package characters;

import characters.base.Character;

public class Crossbowman extends Character {
  public Crossbowman(String name, int x, int y) {
    super(100, 50, 50, 50, 15, 60, 0, 1, name, x, y);
  }

  @Override
  public void attack() {
    System.out.println("Арбалетчик атакует...");
  }

  @Override
  public void heal() {
    System.out.println("Арбалетчик лечится...");
  }

  @Override
  public void go() {
    System.out.println("Арбалетчик идёт...");
  }

  @Override
  public void die() {
    System.out.println("Арбалетчик умер...");
  }

  @Override
  public String toString() {
    return this.name;
  }
}
