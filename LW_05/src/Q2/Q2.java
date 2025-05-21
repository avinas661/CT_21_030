package Q2;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputvalue, count ;
        while (true){
            System.out.println("\n# exit the programme enter negative number #\n\nEnter integer value :");
            inputvalue = scanner.nextInt();
            count = 0;
            int x = inputvalue;

            if (x<0)
                break;
            if (x == 0) {
                count = 1;
            }
            else {
                for (; x != 0; count++) {
                    x /= 10;
                }
            }
            System.out.println("Number of digits : " + count);
        }
    }
}
