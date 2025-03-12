package Q_07;

import java.util.Map;
import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter weight in KG:");
        int w=scanner.nextInt();
        System.out.println("enter height cm:");
        int h=scanner.nextInt();

        double bmi=w/Math.pow((double) h /100,2);

        if (bmi>20 && bmi<25)
            System.out.println("You BMI is Normal : "+bmi);
        else
            System.out.println("You BMI is : "+bmi);



    }
}
