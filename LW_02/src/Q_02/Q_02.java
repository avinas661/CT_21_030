package Q_02;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter centermeter:");
        double c=scanner.nextDouble();

        double inch= c/2.54;

        int feet= (int) (inch/12);
        int binch = (int) (inch%12);

        System.out.println(feet+" :Feets and "+binch+":inches");

    }
}
