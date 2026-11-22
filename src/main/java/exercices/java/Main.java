package exercices.java;

public class Main {

    public static void main(String[] args) {

        // Criando a Factory
        FireFactory factory = new FireFactory();

        // Criando o mapa 30x20
        GameMap gameMap = new GameMap(30, 20);

        // Obtendo os três sprites
        FireSprite common = factory.getSprite(FireType.FIRE);
        FireSprite magic = factory.getSprite(FireType.MAGIC_FIRE);
        FireSprite toxic = factory.getSprite(FireType.TOXIC_FIRE);

        int position = 0;

        // Adicionando 60 fogos comuns
        for (int i = 0; i < 60; i++) {

            int x = position % 30;
            int y = position / 30;

            gameMap.addFire(new Fire(x, y, common));

            position++;
        }

        // Adicionando 40 fogos mágicos
        for (int i = 0; i < 40; i++) {

            int x = position % 30;
            int y = position / 30;

            gameMap.addFire(new Fire(x, y, magic));

            position++;
        }

        // Adicionando 30 fogos tóxicos
        for (int i = 0; i < 30; i++) {

            int x = position % 30;
            int y = position / 30;

            gameMap.addFire(new Fire(x, y, toxic));

            position++;
        }

        // Exibindo o mapa
        gameMap.displayMap();
        gameMap.displayLegend();

        // Exibindo os resultados
        System.out.println("\n--- RESULTADOS ---");

        System.out.println(
            "Total de chamas: " + gameMap.countFires()
        );

        System.out.println(
            "Total de sprites criados: " + factory.getTotalSprites()
        );

        // Testando o compartilhamento
        System.out.println(
            "Sprites comuns compartilhados: " +
            (common == factory.getSprite(FireType.FIRE))
        );

        System.out.println(
            "Sprites comuns e mágicos são diferentes: " +
            (common != magic)
        );

        // Testando sobreposição
        System.out.println(
            "Tentativa de sobreposição: " +
            gameMap.addFire(new Fire(0, 0, common))
        );
    }
}
