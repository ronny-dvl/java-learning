package exercise_02;

import java.util.Scanner;

public class MainEmployee {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Employee func = new Employee();

        System.out.println("Name: ");
        func.name = sc.nextLine();

        System.out.println("Gross Salary: ");
        func.Grosssalary = sc.nextDouble();

        System.out.println("Tax: ");
        func.tax = sc.nextDouble();

        System.out.println(func);

        System.out.println("Which percentage to increase salary? ");
        double porcentage = sc.nextDouble();
        func.increaseSalary(porcentage);

        System.out.println("Update data: " + func.name + ", $ " + String.format("%.2f" , func.Grosssalary));



    }
}
