package entidades;

public class Cuenta {
    private static int generaCuenta = 0;
    private int numeroCuenta;
    private long dni;
    private int saldo;

    public Cuenta() {
        generaCuenta++;
        numeroCuenta = generaCuenta;
    }

    public Cuenta(long dni, int saldo) {
        generaCuenta++;
        numeroCuenta = generaCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "datos de la cuenta: \n" +
                "numeroCuenta=" + numeroCuenta +
                "\ndni=" + dni +
                "\nsaldo=" + saldo + "\n";
    }
}
