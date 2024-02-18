package characters;

public class Lancer extends Character {
  public Lancer() {
    this.name = "Копейщик";
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
