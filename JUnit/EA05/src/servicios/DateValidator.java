package servicios;

public class DateValidator {
    public boolean validaFecha(int dia, int mes, int anio) {
        boolean esBisiesto = (((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0));
        boolean diaMes = (mes > 0 && mes < 13) && (dia > 0 && dia < 32);
        boolean febrero = (mes == 2) && ((dia < 29) || esBisiesto && (dia < 30));
        boolean mes30 = (mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 31);
        boolean mes31 = !(mes == 4 || mes == 6 || mes == 9 || mes == 11) && (mes != 2);
        return diaMes && (febrero || mes30 || mes31);
    }
}
