package Q_10;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input loan amount :");
        int lamount = scanner.nextInt();
        System.out.println("Input annual interest rate :");
        double arate = scanner.nextInt();
        System.out.println("Input loan period in years :");
        int lperi = scanner.nextInt();

        double monthlyInterestRate = arate / 100.0 / 12;
        int numberOfPayments = lperi * 12;
        double monthlyPayment = (lamount * monthlyInterestRate) / (1-Math.pow(1/(1+monthlyInterestRate),numberOfPayments));
        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.println("Your monthly loan payment is : "+monthlyPayment);
        System.out.println("Your total loan payment is : "+totalPayment);

    }
}
