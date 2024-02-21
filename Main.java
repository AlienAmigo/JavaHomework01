import java.util.ArrayList;

import characters.*;
import characters.base.Magic;

public class Main {

  public static void main(String[] args) {
    ArrayList<Character> team1 = new ArrayList<>();
    ArrayList<Character> team2 = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      team1.add(new Character() {
      });
    }
    // Peasant peasant = new Peasant();
    // Bandit bandit = new Bandit();
    // Crossbowman crossbowman = new Crossbowman();
    // Lancer lancer = new Lancer();
    // Monk monk = new Monk();
    // Sniper sniper = new Sniper();
    // Magician magician = new Magician();

    // System.out.println(peasant);
    // System.out.println(bandit);
    // System.out.println(crossbowman);
    // System.out.println(lancer);
    // System.out.println(monk);
    // System.out.println(sniper);
    // System.out.println(magician);

    for (Magic value : Magic.values()) {
      System.out.println(value);
    }
  }
}
