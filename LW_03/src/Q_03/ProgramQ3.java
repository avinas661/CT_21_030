package Q_03;

import java.util.Scanner;

public class ProgramQ3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Circle innerRadius = new Circle();
        Circle outerRadius = new Circle();


        System.out.println("enter radius Inner Circle Radiud :");
        double radius_i = scanner.nextDouble();
        innerRadius.setRadius(radius_i);

        System.out.println("enter radius Outer Circle Radius :");
        double radius_o = scanner.nextDouble();
        outerRadius.setRadius(radius_o);

        double shaded_area = outerRadius.computeArea() - innerRadius.computeArea();
        System.out.println("the shaded area of the circle is " + shaded_area);


    }
}

