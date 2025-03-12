package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter Celsius :");
        double c=scanner.nextDouble();

        double f= (1.8*c)+32;

        System.out.println("Fahrenheit: "+f);

    }
}
