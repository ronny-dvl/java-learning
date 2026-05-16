package exercise_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<ArrayFuncionarios> func = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Emplyoee#" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            func.add(i, new ArrayFuncionarios(id, name, salary));

        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int response = sc.nextInt();
        double porcentage = 0.00;


        for (int j = 0; j < func.size(); j++) {
            if (response == func.get(j).getId()) {
                System.out.print("Enterthe percentage: ");
                porcentage = sc.nextDouble();
                func.get(j).setSalary(porcentage);
            }
        }
        if (porcentage != 0) {
        } else {
            System.out.println("This id does not exist!");
        }


        System.out.println("List of employees: ");
        for (ArrayFuncionarios obj : func) {
            System.out.println(obj);
        }
    }
}
