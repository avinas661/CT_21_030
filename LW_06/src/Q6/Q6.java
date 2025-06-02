package Q6;

import Q1.Cat;
import Q1.Dog;
import Q1.Pet;

import java.util.Scanner;



public class Q6 {
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);
        String name;
        int maxvalue =10, dogcount = 0, catcount=0;

        Pet[] dog = new Pet[maxvalue];
        Pet[] cat = new Pet[maxvalue];



        while (true){

            printmenu();
            int ope =scanner.nextInt();

            if (ope==1){
                System.out.println("Enter the Cat Name :");
                name = scanner.nextLine();
                scanner.nextLine();

                cat[catcount] = new Cat(name);
                System.out.println("Enter coatcolor :");
                String coatColor = scanner.nextLine();
                ((Cat) cat[catcount]).setCoatColor(coatColor);
                catcount++;
            }
            else if (ope==2){
                System.out.println("Enter the Dog Name :");
                name = scanner.nextLine();
                scanner.nextLine();

                dog[dogcount] = new Dog(name);
                System.out.println("Enter weight :");
                double weight = scanner.nextDouble();
                scanner.nextLine();
                ((Dog) dog[dogcount]).setWeight(weight);
                dogcount++;
            }
            else if (ope==3){
                System.out.println("Enter the cat name to remove :");
                String x= scanner.nextLine();
                scanner.nextLine();

                for (int i=0; i<catcount; i++){
                    if (cat[i].getName().equals(x)){
                        cat[i].setName("NULL");
                        break;
                    }
                }
            }
            else if (ope==4){
                System.out.println("Enter the dog name to remove :");
                String x= scanner.nextLine();
                scanner.nextLine();

                for (int i=0; i<dogcount; i++){
                    if (dog[i].getName().equals(x)){
                        dog[i].setName("NULL");
                        break;
                    }
                }
            }
            else if (ope==0){
                break;
            }
            else
                System.out.println("invalid operation");


        }

    }

    public static void  printmenu (){
        System.out.println("1. Add Cat ");
        System.out.println("2. Add Dog ");
        System.out.println("3. Remove Cat ");
        System.out.println("4. Remove Dog ");
        System.out.println("0. Quit ");
    }




}
