package characters;

import characters.util.Character;

public class Peasant extends Character {
  public Peasant() {
    this.name = "Крестьянин";
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
