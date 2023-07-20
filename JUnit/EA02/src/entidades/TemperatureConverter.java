package entidades;

public class TemperatureConverter {
    public double celciusFahrenheit(double temperatura) {
        return (temperatura * 9 / 5) + 32;
    }

    public double fahrenheitCelcius(double temperatura) {
        return (temperatura - 32) * 5 / 9;
    }

    public double celciusKelvin(double temperatura) {
        return temperatura + 273.15;
    }

    public double kelvinCelcius(double tempearatura) {
        return tempearatura - 273.15;
    }
}
