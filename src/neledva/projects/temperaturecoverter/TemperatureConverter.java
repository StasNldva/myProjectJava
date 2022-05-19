package neledva.projects.temperaturecoverter;

class TemperatureConverter {

    public double celsiusToKelvin(double temperature) {
        //T(K) = T(C) + 273,15 (Celsius to Kelvin conversion)
        return temperature + 273.15;
    }

    public double kelvinToCelsius(double temperature) {
        //T(C) = T(K) - 273,15 (conversion from Kelvin to Celsius)
        return temperature - 273.15;
    }

    public double celsiusToFahrenheit(double temperature) {
        //T(F) = 32 + (T(C) * 9/5) (Celsius to Fahrenheit conversion)
        return 32 + (temperature * 9/5);
    }

    public double fahrenheitToCelsius(double temperature) {
        //T(C) = 5/9 * (T(F) - 32) (Fahrenheit to Celsius conversion)
        return 5.0/9.0 * (temperature - 32.0);
    }

    public double celsiusToNewton(double temperature) {
        //T(N) = T(C) * 33 / 100 (Celsius to Newton conversion)
        return temperature * 33 / 100;
    }

    public double newtonToCelsius(double temperature) {
        //T(C) = T(N) * 100 / 33 (Newton to Celsius conversion)
        return temperature * 100 / 33;
    }

}