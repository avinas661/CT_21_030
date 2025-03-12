package Q_09;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of invest doller:");
        int p= scanner.nextInt();
        System.out.println("Enter annual interest rate:");
        int r= scanner.nextInt();
        System.out.println("Enter No years:");
        int n= scanner.nextInt();

        double amount = p*Math.pow((1+((double) r /100)),n);
        double earn= amount - p;

        System.out.println("Amount earned after "+n+" years is : "+earn+" dollars");

    }
}
