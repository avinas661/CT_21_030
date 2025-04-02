package Q_01;

import java.util.Scanner;

public class ProgramQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter celsius :");
        double celsius = scanner.nextDouble();

        Temperature ToFahrenheit = new Temperature();
        ToFahrenheit.setCelsius(celsius);
        System.out.println("celsius is converted into fahrenheit : "+ToFahrenheit.toFahrenheit());
    }
}
