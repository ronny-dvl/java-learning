package exercise_09;

import java.util.Scanner;

public class VetorPessoaVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos pessoas vai digitar? ");
        int n = sc.nextInt();

        VectPessoaVelha[] person = new VectPessoaVelha[n];


        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("\nName: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            person[i] = new VectPessoaVelha(name, age);

        }
        int maiorIdade = person[0].getAge();
        String nameMaiorIdade = person[0].getName();

        for (int i = 1; i < n; i++) {

            if (person[i].getAge() > maiorIdade){
                maiorIdade = person[i].getAge();
                nameMaiorIdade = person[i].getName();
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nameMaiorIdade);


    }
}