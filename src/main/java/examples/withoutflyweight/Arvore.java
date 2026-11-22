package examples.withoutflyweight;

import examples.EspecieArvore;

import java.util.Arrays;
import java.util.Objects;

public class Arvore {
    private final int x;
    private final int y;
    private final EspecieArvore especie;
    private final byte[] textura;

    public Arvore(int x, int y, EspecieArvore especie, byte[] textura) {
        this.x = x;
        this.y = y;
        this.especie = Objects.requireNonNull(especie, "especie");
        this.textura = Arrays.copyOf(
                Objects.requireNonNull(textura, "textura"),
                textura.length
        );
    }

    public int getTexturaBytes() {
        return textura.length;
    }
}
