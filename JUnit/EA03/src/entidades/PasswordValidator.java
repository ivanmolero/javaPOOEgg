package entidades;

public class PasswordValidator {
    public boolean longitudMinima(String pass) {
        return pass.length() >= 8;
    }

    public boolean caracteresEspeciales(String pass) {
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < pass.length(); i++) {
            if (!caracteres.contains(pass.substring(i, i + 1))) {
                return true;
            }
        }
        return false;
    }

    public boolean caseSensitive(String pass) {
        return !pass.equals(pass.toLowerCase());
    }
}
