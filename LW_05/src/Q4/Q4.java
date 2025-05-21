package Q4;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the row for make pyramid :");
        int row = scanner.nextInt();

        for (int i=0; i<row; i++){
            for (int j=row-i; j>0;j--){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}