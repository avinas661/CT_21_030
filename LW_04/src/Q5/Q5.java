package Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n   Entree\t\t\t\t      Side Dish\t\t\t\t      Drink");
        System.out.println("1. Tofu Burger\t\t$3.49  5. Rice Cracker\t\t$0.79  9. Cafe Mocha\t\t$1.99");
        System.out.println("2. Cajun Chicken\t$4.59  6. No-Salt Fries\t\t$0.69  10.Cafe Latte\t\t$1.90");
        System.out.println("3. Buffalo Wings\t$3.99  7. Zucchini\t\t\t$1.09  11.Espresso\t\t\t$2.49");
        System.out.println("4. Rainbow Fillet\t$2.99  8. Brown Rice\t\t$0.59  12.Oolong Tea\t\t$0.99");


        System.out.println("\nplease enter which item you want :");
        int item = scanner.nextInt();

        switch (item){
            case 1:
                System.out.println("Tofu Burger is $3.49");
                break;
            case 2:
                System.out.println("Cajun Chicken is $4.59");
                break;
            case 3:
                System.out.println("Buffalo Wings is $3.99");
                break;
            case 4:
                System.out.println("Rainbow Fillet is $2.99");
                break;
            case 5:
                System.out.println("Rice Cracker is $0.79");
                break;
            case 6:
                System.out.println("No-Salt Fries is $0.69");
                break;
            case 7:
                System.out.println("Zucchini is $1.09");
                break;
            case 8:
                System.out.println("Brown Rice is $0.59");
                break;
            case 9:
                System.out.println("Cafe Mocha is $1.99");
                break;
            case 10:
                System.out.println("Cafe Latte is $1.90");
                break;
            case 11:
                System.out.println("Espresso is $2.49");
                break;
            case 12:
                System.out.println("Oolong Tea is $0.99");
                break;
            default:
                System.out.println("Invalid entry");
                break;

        }
    }
}


