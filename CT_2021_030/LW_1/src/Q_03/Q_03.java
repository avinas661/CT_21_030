package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner scanner= new Scanner(System.in);
        // user to enter their first name
        System.out.println("Enter fname: ");
        String fname = scanner.next();
        // user to enter their middle name
        System.out.println("Enter midname: ");
        String midname = scanner.next();
        // user to enter their last name
        System.out.println("Enter lname: ");
        String lname = scanner.next();
        // Extracting the first letter of the middle name
        String ini = midname.substring(0,1);
        // Displaying the formatted name
        System.out.println(fname+" "+ini+". "+lname);
    }
}
