package servicios;

public class PalindromeChecker {
    public boolean verificaPalindromo(String palabra) {
        String inverso = new StringBuilder(palabra.trim()).reverse().toString();
        return palabra.trim().equalsIgnoreCase(inverso);
    }
}
