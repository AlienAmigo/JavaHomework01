package characters;

import characters.base.Character;

public class Sniper extends Character {
  public Sniper(String name, int x, int y) {
    super(100, 50, 50, 30, 10, 60, 0, 1, name, x, y);
  }

  @Override
  public void attack() {
    System.out.println("Снайпер атакует...");
  }

  @Override
  public void heal() {
    System.out.println("Снайпер лечится...");
  }

  @Override
  public void go() {
    System.out.println("Снайпер идёт...");
  }

  @Override
  public void die() {
    System.out.println("Снайпер умер...");
  }

  @Override
  public String toString() {
    return this.name;
  }
}
