package characters;

import characters.util.Character;

public class Crossbowman extends Character {
  public Crossbowman() {
    this.name = "Арбалетчик";
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
