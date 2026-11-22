package exercices.java;

public class GameMap {

    private final int width;
    private final int height;

    private final Fire[][] map;

    public GameMap(int width, int height) {
        this.width = width;
        this.height = height;

        map = new Fire[height][width];
    }

    public boolean addFire(Fire fire) {

        int x = fire.getX();
        int y = fire.getY();

        // Verifica os limites do mapa
        if (x < 0 || x >= width || y < 0 || y >= height) {
            System.out.println("Posição fora dos limites!");
            return false;
        }

        // Verifica se a posição já está ocupada
        if (map[y][x] != null) {
            System.out.println("Posição já ocupada!");
            return false;
        }

        map[y][x] = fire;

        return true;
    }


    public void displayMap() {

        String reset = "\u001B[0m";
        String gray = "\u001B[90m";

        for (int y = 0; y < height; y++) {

            for (int x = 0; x < width; x++) {

                if (map[y][x] == null) {

                    System.out.print(gray + ". " + reset);

                } else {

                    FireSprite sprite = map[y][x].getSprite();

                    System.out.print(
                            sprite.getColor() +
                                    sprite.getSymbol() +
                                    " " +
                                    reset
                    );
                }
            }

            System.out.println();
        }
    }


    public void displayLegend() {

        System.out.println("\n--- LEGENDA ---");

        for (FireType type : FireType.values()) {

            System.out.println(
                    type.getColor() +
                            type.getSymbol() +
                            " - " +
                            type.getDescription() +
                            "\u001B[0m"
            );
        }

        System.out.println("\u001B[90m. - Espaço vazio\u001B[0m");
    }



    public int countFires() {

        int total = 0;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                if (map[y][x] != null) {
                    total++;
                }
            }
        }

        return total;
    }
}
