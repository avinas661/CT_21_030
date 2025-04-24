package Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the year : ");
        int year = scanner.nextInt();

        int x=year%4;
        int y=year%100;
        int z=year%400;

        if ((x==0 && y!=0) || (x==0 && y==0 && z==0)){
            System.out.println(year+" is a leap year");
        }
        else
            System.out.println(year+" is not a leap year");
    }
}

