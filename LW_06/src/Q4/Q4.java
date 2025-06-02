package Q4;

import Q1.Cat;
import Q1.Dog;
import Q1.Pet;

import java.util.Scanner;

public class Q4 {
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
                System.out.println("Enter weight :");
                double weight = scanner.nextDouble();
                scanner.nextLine();
                ((Dog) pets[petcount]).setWeight(weight);
            }

            else if (type=='c') {
                pets[petcount] =new Cat(name);
                System.out.println("Enter coatcolor :");
                String coatColor = scanner.nextLine();
                ((Cat) pets[petcount]).setCoatColor(coatColor);
            }

            else
                System.out.println("invalid type");



            petcount++;

        }

        System.out.println("\nThe Cats names:\n");

        for (int i =0; i<petcount; i++){
            if (pets[i] instanceof Cat)
                System.out.println("\npet "+i+" : "+pets[i].getName()+" is a "+pets[i].getClass().getSimpleName()+" Coatcolor : "+((Cat) pets[i]).getCoatColor());
            else
                System.out.println("\npet "+i+" : "+pets[i].getName()+" is a "+pets[i].getClass().getSimpleName()+" Weight : "+((Dog) pets[i]).getWeight());

        }

    }
}
