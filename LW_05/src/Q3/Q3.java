package Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter the integer for show multiplication table :");
        int N= scanner.nextInt();

        for (int i =1;i<=10; ++i){
            int z = i*N;
            System.out.println(""+i+"*"+N+"="+z);
        }
    }
}