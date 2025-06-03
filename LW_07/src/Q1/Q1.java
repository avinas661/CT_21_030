package Q1;

import javax.swing.*;
public class Q1 {
    public static void main(String[] args) {
        String intput1 = JOptionPane.showInputDialog("Enter the first integer :");
        int num1 = Integer.parseInt(intput1);

        String intput2 = JOptionPane.showInputDialog("Enter the second integer :");
        int num2 = Integer.parseInt(intput2);

        String intput3 = JOptionPane.showInputDialog("Enter the third integer :");
        int num3 = Integer.parseInt(intput3);

        int sum = num1+num2+num3;

        JOptionPane.showMessageDialog(null, "The sum is : "+sum);
    }
}