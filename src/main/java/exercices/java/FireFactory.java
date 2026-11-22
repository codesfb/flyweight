package exercices.java;

import java.util.HashMap;
import java.util.Map;

public class FireFactory {

    private final Map<FireType, FireSprite> sprites =
            new HashMap<>();

    public FireSprite getSprite(FireType type) {

        if (!sprites.containsKey(type)) {

            sprites.put(type, new FireSprite(type));

            System.out.println(
                "Novo sprite criado: " + type.getDescription()
            );
        }

        return sprites.get(type);
    }

    public int getTotalSprites() {
        return sprites.size();
    }
}
