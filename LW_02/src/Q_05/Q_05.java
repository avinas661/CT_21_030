package Q_05;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter Fahrenheit :");
        double fah=scanner.nextDouble();

        double cel=(fah-32)/1.8;

        System.out.println("Celsius: "+cel);

    }
}
