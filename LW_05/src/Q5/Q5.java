package Q5;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the word or phrase :");
        String x= scanner.nextLine();
        int length = x.length();

        String reverse ="";

        for (int i = length-1 ; i>=0; i--){
            reverse+= x.charAt(i);
        }
        if (x.equals(reverse))
            System.out.println("given word is palindrome");
        else
            System.out.println("given not word is palindrome");
    }
}
