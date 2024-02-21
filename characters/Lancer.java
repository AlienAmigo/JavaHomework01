package characters;

import characters.base.Character;

public class Lancer extends Character {
  public Lancer(String name, int x, int y) {
    super(100, 70, 70, 30, 35, 60, 0, 1, name, x, y);
  }

  @Override
  public void attack() {
    System.out.println("Копейщик атакует...");
  }

  @Override
  public void heal() {
    System.out.println("Копейщик лечится...");
  }

  @Override
  public void go() {
    System.out.println("Копейщик идёт...");
  }

  @Override
  public void die() {
    System.out.println("Копейщик умер...");
  }

  @Override
  public String toString() {
    return this.name;
  }
}
