package examples.withflyweight;

import examples.EspecieArvore;

import java.util.Arrays;
import java.util.Objects;

public final class TipoArvore {
    private final EspecieArvore especie;
    private final byte[] textura;

    TipoArvore(EspecieArvore especie, byte[] textura) {
        this.especie = Objects.requireNonNull(especie, "especie");
        this.textura = Arrays.copyOf(
                Objects.requireNonNull(textura, "textura"),
                textura.length
        );
    }

    public EspecieArvore getEspecie() {
        return especie;
    }

    public int getTexturaBytes() {
        return textura.length;
    }
}
