package exercices.java;

public class FireSprite {

    private final FireType type;
    private final char symbol;
    private final String color;

    public FireSprite(FireType type) {
        this.type = type;
        this.symbol = type.getSymbol();
        this.color = type.getColor();
    }

    public FireType getType() {
        return type;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getColor() {
        return color;
    }
}
