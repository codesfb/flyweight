package examples.withflyweight;

import examples.EspecieArvore;

import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

public class FabricaArvores {
    private final Map<EspecieArvore, TipoArvore> tipos =
            new EnumMap<>(EspecieArvore.class);

    public TipoArvore obterTipo(EspecieArvore especie, byte[] textura) {
        Objects.requireNonNull(especie, "especie");
        Objects.requireNonNull(textura, "textura");
        return tipos.computeIfAbsent(
                especie,
                chave -> new TipoArvore(chave, textura)
        );
    }

    public int getTotalTipos() {
        return tipos.size();
    }
}
