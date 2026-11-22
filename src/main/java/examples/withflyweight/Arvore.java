package examples.withflyweight;

import java.util.Objects;

public class Arvore {
    private final int x;
    private final int y;
    private final TipoArvore tipo;

    public Arvore(int x, int y, TipoArvore tipo) {
        this.x = x;
        this.y = y;
        this.tipo = Objects.requireNonNull(tipo, "tipo");
    }
}
