package Q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y, z, small;

        System.out.println("enter 1st number");
        x=scanner.nextInt();

        System.out.println("enter 2nd number");
        y=scanner.nextInt();

        System.out.println("enter 3rd number");
        z=scanner.nextInt();

        small=x;

        if(small>y)
            small = y;
        if (small>z)
            small = z;

        System.out.println("the smallest number is : "+small);

    }
}