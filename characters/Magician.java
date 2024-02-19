package characters;

public class Magician extends Character {
  public Magician() {
    this.name = "Колдун";
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
