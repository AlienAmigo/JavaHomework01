package characters;

public class Sniper extends Character {
  public Sniper() {
    this.name = "Снайпер";
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
