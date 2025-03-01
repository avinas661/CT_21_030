package Q_06;

import javax.swing.*;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner scanner= new Scanner(System.in);
        // user to enter the title
        System.out.println("enter title");
        String tit= scanner.nextLine();
        // user to enter the width
        System.out.println("enter wide in px: ");
        int w= scanner.nextInt();
        // user to enter the height
        System.out.println("enter height in px1: ");
        int h= scanner.nextInt();
        // Creating a JFrame object
        JFrame frame = new JFrame();
        // Setting the window size, title and visible
        frame.setSize(w,h);
        frame.setTitle(tit);
        frame.setVisible(true);
    }
}
