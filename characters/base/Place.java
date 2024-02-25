package characters.base;

import config.Config;

import java.util.Random;

public class Place {
    int x, y;

    Place(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Place getRand() {
        Random random = new Random();
        return new Place(random.nextInt(Config.MAX_X + 1), random.nextInt(Config.MAX_Y + 1));
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
