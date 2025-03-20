package Q_04;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter body weight in Pound(lb) :");
        double pound=scanner.nextDouble();

        double cal= pound*19;

        System.out.println("calories per day: "+cal);

    }
}
