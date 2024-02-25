package characters.base;

import java.util.Random;

public class Place {
    int x, y;

    Place(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static int getRand(int minValue, int maxValue) {
        Random random = new Random();
        return minValue + random.nextInt(maxValue - minValue + 1);
    }

    public static Double calcDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
