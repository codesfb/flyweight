package exercices.java;

public class Fire {

    private final int x;
    private final int y;
    private final FireSprite sprite;

    public Fire(int x, int y, FireSprite sprite) {
        this.x = x;
        this.y = y;
        this.sprite = sprite;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public FireSprite getSprite() {
        return sprite;
    }
}
