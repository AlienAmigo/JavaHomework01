import java.util.*;

import characters.*;
import characters.base.*;
import characters.base.Place;
import characters.config.Config;
import characters.base.Character;
import characters.base.Magic;

public class Main {
  public static Character createCharacter(int index, String name, int x, int y) {
    switch (index) {
      case 1:
        return new Bandit(name, x, y);
      case 2:
        return new Crossbowman(name, x, y);
      case 3:
        return new Lancer(name, x, y);
      case 4:
        return new Magician(name, x, y);
      case 5:
        return new Monk(name, x, y);
      case 6:
        return new Peasant(name, x, y);
      default:
        return new Sniper(name, x, y);
    }
  }

  public static void main(String[] args) {
    ArrayList<Character> team1 = new ArrayList<>();
    ArrayList<Character> team2 = new ArrayList<>();
    Random rand = new Random();
    for (int i = 0; i < 20; i++) {
      team1.add(
          createCharacter(rand.nextInt(7 + 1), Names.getName(), Place.getRand(Config.MAX_X),
              Place.getRand(Config.MAX_Y)));
      team2.add(
          createCharacter(rand.nextInt(7 + 1), Names.getName(), Place.getRand(Config.MAX_X),
              Place.getRand(Config.MAX_Y)));
    }

    for (int i = 0; i < team1.size(); i++) {
      if (i == 0) {
        System.out.println("Team 1:");
      }
      System.out.println(i + " " + team1.get(i).name);

    }

    // for (Magic value : Magic.values()) {
    // System.out.println(value);
    // }
  }
}
