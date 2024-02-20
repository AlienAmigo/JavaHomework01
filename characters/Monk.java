package characters;

import characters.util.Character;

public class Monk extends Character {
  public Monk() {
    this.name = "Монах";
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
