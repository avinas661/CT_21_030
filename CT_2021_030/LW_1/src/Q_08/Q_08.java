package Q_08;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner scanner= new Scanner(System.in);
        // user to enter a sentence with a single '!' mark
        System.out.println("Enter sentence with single ' ! ' mark where divide :");
        String str= scanner.nextLine();
        // Finding the index of the '!' character
        int index = str.indexOf('!');
        // Printing the substring before '!'
        System.out.println(str.substring(0, index));
        // Printing the substring after '!'
        System.out.println(str.substring(index+2));
    }
}

