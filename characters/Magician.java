package characters;

import characters.base.Character;

public class Magician extends Character {
  public Magician(String name, int x, int y) {
    super(100, 30, 60, 90, 10, 60, 100, 1, name, x, y);
  }

  @Override
  public void attack() {
    System.out.println("Колдун атакует...");
  }

  @Override
  public void heal() {
    System.out.println("Колдун лечится...");
  }

  @Override
  public void go() {
    System.out.println("Колдун идёт...");
  }

  @Override
  public void die() {
    System.out.println("Колдун умер...");
  }

  @Override
  public String toString() {
    return this.name;
  }
}
