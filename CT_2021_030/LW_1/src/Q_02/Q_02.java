package Q_02;

import javax.swing.*;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {

        // Creating a Scanner object
        Scanner scanner= new Scanner(System.in);

        // user to enter their first name
        System.out.println("Enter first name: ");
        String firstname = scanner.next();

        // user to enter their last name
        System.out.println("Enter last name: ");
        String lastname = scanner.next();

        // Creating a JFrame object
        JFrame frame = new JFrame();

        // Setting the window size, title and visible
        frame.setSize(300,200);
        frame.setTitle(firstname+" "+lastname);
        frame.setVisible(true);

    }
}
