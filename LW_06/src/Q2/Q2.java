package Q2;

import Q1.Cat;
import Q1.Dog;
import Q1.Pet;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int maxvalue =10, petcount = 0;

        Pet[] pets = new Pet[maxvalue];

        while (true){
            System.out.println("Enter the Pet Name ( STOP to quit):");
            name = scanner.nextLine();

            if (name.equals("stop"))
                break;

            System.out.println("Enter Pet type ‘c’ for cat and ‘d’ for dog :");
            char type = scanner.nextLine().charAt(0);


            if (type=='d'){
                pets[petcount] = new Dog(name);
            } else if (type=='c') {
                pets[petcount] =new Cat(name);
            }else
                System.out.println("invalid type");

            petcount++;

        }

        for (int i =0; i<petcount; i++){

            System.out.println("pet "+i+" : "+pets[i].getName()+" is a "+pets[i].getClass().getSimpleName());
        }
    }
}
