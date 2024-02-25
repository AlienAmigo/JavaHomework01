package characters.base;

import java.util.Random;

public class Place {
  int x, y;

  public static int getRand(int bound) {
    Random random = new Random();
    return (random.nextInt(bound + 1));
  }

  Place(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
