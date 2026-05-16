package exercise_06;

import java.util.Scanner;

public class MainTriange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Enter area X: %.4f%n", areaX);
        System.out.printf("Enter area Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.printf("Larger area: X");
        } else {
            System.out.printf("Larger area: Y");
        }

        sc.close();
    }

}








