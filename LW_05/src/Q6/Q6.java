package Q6;
import java.util.Random;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random num= new Random();
        while (true){
            int x = num.nextInt(100)+1;
            System.out.println("enter the guessed number between 1 to 100 :");
            int y = scanner.nextInt();
            if (x==y){
                System.out.println("guessed correctly");
                break;
            }
            else if (x>y) {
                System.out.println(y + " is lower than random number");
            }
            else{
                System.out.println(y + " is higher than random number");
            }
        }
    }
}
