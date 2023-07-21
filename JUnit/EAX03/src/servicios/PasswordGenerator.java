package servicios;

public class PasswordGenerator {
    public String generaPassword() {
        String contrasena = "";
        String[] caracteres = {"abcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "0123456789", "ªº!|@#~¬!·$%&/()=?¿'¡^*¨Çḉ{}[]'\""};
        int longitud = 8;
        for (int i = 0; i < longitud; i++) {
            int grupo = (int)(Math.random() * 100) % 4;
            int posicion = (int)(Math.random() * caracteres[grupo].length());
            contrasena += caracteres[grupo].substring(posicion, posicion + 1);
        }
        return contrasena;
    }
}
