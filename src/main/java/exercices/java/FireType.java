package exercices.java;

public enum FireType {

    FIRE('O', "Fogo comum", "\u001B[38;5;208m"),
    MAGIC_FIRE('B', "Fogo mágico", "\u001B[34m"),
    TOXIC_FIRE('V', "Fogo tóxico", "\u001B[32m");

    private final char symbol;
    private final String description;
    private final String color;

    FireType(char symbol, String description, String color) {
        this.symbol = symbol;
        this.description = description;
        this.color = color;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }
}
