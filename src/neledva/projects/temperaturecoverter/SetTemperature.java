package neledva.projects.temperaturecoverter;

public class SetTemperature {
    public static void main(String[] args) {
        TemperatureConverter tm = new TemperatureConverter();
        System.out.println("celsiusToKelvin -> " + tm.celsiusToKelvin(0));
        System.out.println("kelvinToCelsius -> " + tm.kelvinToCelsius(0));
        System.out.println("celsiusToFahrenheit -> " + tm.celsiusToFahrenheit(50));
        System.out.println("fahrenheitToCelsius -> " + tm.fahrenheitToCelsius(68));
        System.out.println("celsiusToNewton -> " + tm.celsiusToNewton(120));
        System.out.println("newtonToCelsius -> " + tm.newtonToCelsius(50));
    }
}
