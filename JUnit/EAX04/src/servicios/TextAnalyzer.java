package servicios;

import java.util.*;

public class TextAnalyzer {
    public int numeroPalabras(String texto) {
        texto = normalizaTexto(texto);
        return texto.split(" ").length;
    }

    public int numeroFrases(String texto) {
        texto = normalizaTexto(texto);
        return texto.split("\\.").length;
    }

    public Map<String, Integer> frecuenciaPalabras(String texto) {
        texto = normalizaTexto(texto).replaceAll("\\.", "");
        List<String> palabras = Arrays.stream(texto.split(" ")).toList();
        Set<String> unicos = new HashSet<>(palabras);
        Map<String, Integer> frecuencia = new HashMap<>();
        for (String unico : unicos) {
            frecuencia.put(unico, 0);
            for (String palabra : palabras) {
                if (palabra.equals(unico)) {
                    frecuencia.put(unico, frecuencia.get(unico) + 1);
                }
            }
        }
        return frecuencia;
    }

    private String normalizaTexto(String texto) {
        return texto
                .trim()
                .toLowerCase()
                .replaceAll("á", "a")
                .replaceAll("é", "e")
                .replaceAll("í", "i")
                .replaceAll("ó", "o")
                .replaceAll("ú", "u")
                .replaceAll(";", "")
                .replaceAll(",", "");
    }
}
