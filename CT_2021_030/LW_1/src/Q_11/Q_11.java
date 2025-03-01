package Q_11;

import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner scanner= new Scanner(System.in);
        // user to enter their full name
        System.out.println("enter your full name in order 'first middle last' :");
        String name= scanner.nextLine();
        // Splitting the name
        String[] array= name.split(" ");
        // Printing the formatted name
        System.out.print(array[2]+", "+array[0]+" "+array[1].charAt(0)+".");

    }
}
