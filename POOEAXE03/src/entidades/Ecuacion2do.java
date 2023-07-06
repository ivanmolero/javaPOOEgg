package entidades;

public class Ecuacion2do {
    private double a;
    private double b;
    private double c;

    public Ecuacion2do() {
    }

    public Ecuacion2do(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Ecuacion: " + a + " * x² + " + b + " * x + " + c;
    }
}
