package Q5;

import Q1.Cat;
import Q1.Dog;
import Q1.Pet;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int maxvalue =10, petcount = 0,count=0;

        Pet[] pets = new Pet[maxvalue];
        Pet[] petdog = new Pet[maxvalue];


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
                petdog[count]=(Dog) pets[petcount];
                count++;
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


        //average max min

        int total=0,max =0,min =(int) ((Dog) petdog[0]).getWeight();

        for (int i=0; i<count; i++){
            total+= (int) ((Dog) petdog[i]).getWeight();

            if (max<(int) ((Dog) petdog[i]).getWeight()){
                max=(int) ((Dog) petdog[i]).getWeight();
            }

            if (min>(int) ((Dog) petdog[i]).getWeight()){
                min=(int) ((Dog) petdog[i]).getWeight();
            }

        }

        System.out.println("the average dogs weight is : "+(total/count)+" Kg");
        System.out.println("the max dogs weight is : "+max+" Kg");
        System.out.println("the min dogs weight is : "+min+" Kg");


    }
}
