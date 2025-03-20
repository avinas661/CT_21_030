package Q_08;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        double pi=3.14;

        System.out.println("Enter sphere radius in cm:");
        double r= scanner.nextDouble();

        double v=((double) 4 /3)*(pi*Math.pow(r,3));

        System.out.println("The sphere volume is : "+v+" cm^3");
    }
}
