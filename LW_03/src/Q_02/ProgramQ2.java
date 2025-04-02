package Q_02;

import Q_01.Temperature;

import java.util.Scanner;

public class ProgramQ2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Temperature ToCelsius = new Temperature();

        System.out.println("enter fahrenheit :");
        double fahrenheit = scanner.nextDouble();

        ToCelsius.setFahrenheit(fahrenheit);
        System.out.println("fahrenheit in celsius : "+ToCelsius.toCelsius());
    }
}
