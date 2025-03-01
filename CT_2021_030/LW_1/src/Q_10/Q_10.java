package Q_10;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner scanner=new Scanner(System.in);
        // user to enter a word
        System.out.println("enter the word :");
        String str= scanner.nextLine();
        // Getting the length of the word
        int len= str.length();
        // Checking if the length is odd
        if ((len%2)==1)
            System.out.println(str.charAt(len/2));
        // Printing a message if the word has an even number of characters
        else
            System.out.println("enteren word is even count");
    }
}
