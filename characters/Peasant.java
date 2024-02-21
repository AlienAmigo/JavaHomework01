package characters;

import characters.base.Character;

public class Peasant extends Character {
  public Peasant(String name, int x, int y) {
    super(100, 50, 50, 30, 10, 60, 0, 1, name, x, y);
  }

  @Override
  public void attack() {
    System.out.println("Крестьянин атакует...");
  }

  @Override
  public void heal() {
    System.out.println("Крестьянин лечится...");
  }

  @Override
  public void go() {
    System.out.println("Крестьянин идёт...");
  }

  @Override
  public void die() {
    System.out.println("Крестьянин умер...");
  }

  @Override
  public String toString() {
    return this.name;
  }
}
