package examples.withflyweight;

import examples.EspecieArvore;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Main {
    private static final int TOTAL_ARVORES = 10_000;
    private static final int TEXTURA_BYTES = 64 * 64 * 4;

    public static void main(String[] args) {
        Map<EspecieArvore, byte[]> texturas = criarTexturas();
        EspecieArvore[] especies = EspecieArvore.values();
        FabricaArvores fabrica = new FabricaArvores();
        List<Arvore> arvores = new ArrayList<>(TOTAL_ARVORES);

        for (int i = 0; i < TOTAL_ARVORES; i++) {
            EspecieArvore especie = especies[i % especies.length];
            TipoArvore tipo = fabrica.obterTipo(especie, texturas.get(especie));
            arvores.add(new Arvore(i, i, tipo));
        }

        long memoriaTexturas = fabrica.getTotalTipos() * (long) TEXTURA_BYTES;

        System.out.println("Exemplo com Flyweight");
        System.out.println("Árvores criadas: " + arvores.size());
        System.out.println("Tipos e buffers compartilhados: "
                + fabrica.getTotalTipos());
        imprimirMemoriaTexturas(memoriaTexturas);
    }

    private static Map<EspecieArvore, byte[]> criarTexturas() {
        Map<EspecieArvore, byte[]> texturas =
                new EnumMap<>(EspecieArvore.class);
        for (EspecieArvore especie : EspecieArvore.values()) {
            texturas.put(especie, new byte[TEXTURA_BYTES]);
        }
        return texturas;
    }

    private static void imprimirMemoriaTexturas(long bytes) {
        double mebibytes = (double) bytes / (1024 * 1024);
        System.out.printf(
                Locale.ROOT,
                "Memória teórica das texturas: %d bytes (%.2f MiB)%n",
                bytes,
                mebibytes
        );
    }
}
