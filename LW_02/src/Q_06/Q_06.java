package Q_06;

import java.time.Year;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter born year:");
        int year=scanner.nextInt();

        int currentYear = Year.now().getValue();

        int age= currentYear-year;

        System.out.println("You were born in "+year+" and will be (are) "+age+" this year.");

    }
}
