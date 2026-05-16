package exercise_04;

import java.util.Scanner;

public class MainFuncionarios {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Funcionarios func = new Funcionarios();

        System.out.println("What is your name?");
        func.name = sc.nextLine();

        System.out.println("What is your salary?");
        func.salary = sc.nextDouble();

        double rate = Funcionarios.tax(func.salary);
        System.out.println(func);
        System.out.printf("Calculated Tax: %.2f%n" , rate);

        System.out.println("\nPercentage you want to increase in the salary:");
        double porcentage = sc.nextDouble();
        func.increaseSalary(porcentage);

        rate = Funcionarios.tax(func.salary);

        System.out.println(func);
        System.out.printf("Calculated Tax: %.2f%n" , rate);

        sc.close();

    }
}
