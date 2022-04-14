package src.ChapterSix;
import java.util.Scanner;
/*
(Temperature Conversions) Implement the following integer methods:
a) Method Kelvin returns the Kelvin equivalent of a Celsius temperature, using the calculation
Kelvin = Celsius + 273.15;
b) Method Celsius returns the Celsius equivalent of a Kelvin temperature, using the calculation
Celsius = Kelvin - 273.15;
c) Use the methods from parts (a) and (b) to write an application that enables the user to
enter a Kelvin temperature and display the Celsius equivalent, or, to enter a Celsius
temperature and display the Kelvin equivalent.
 */
public class TemperatureConversions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature in kelvin: ");
        double kelvin = scanner.nextDouble();
        System.out.println(convertKelvinToCelsius(kelvin));
        System.out.println("Enter a temperature in celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println(convertCelsiusToKelvin(celsius));

    }
    public static double convertKelvinToCelsius(double celsius){
        double kelvin  = celsius + 273.15;
        return kelvin;
    }
    public static double convertCelsiusToKelvin(double kelvin){
        double celsius = kelvin - 273.15;
        return celsius;
    }

}

