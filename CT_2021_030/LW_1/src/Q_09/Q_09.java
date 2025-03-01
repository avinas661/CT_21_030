package Q_09;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner scanner=new Scanner(System.in);
        // user to enter a string
        System.out.println("enter the string :");
        String str= scanner.nextLine();
        // Getting the length of the string
        int len = str.length();
        // Printing the length of the string, first character ans last character
        System.out.println(len);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(len-1));

    }
}
