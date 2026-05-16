package exercise_11;

import java.util.Scanner;

public class FixacaoVetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();

        double quantity = 0;
        double soma = 0.00;

        FixacaoVetorObject[] person = new FixacaoVetorObject[n];

        for (int i = 0; i < person.length; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            person[i] = new FixacaoVetorObject(name, idade, altura);

            soma += person[i].getAltura();
            if (person[i].getIdade() < 16){
                quantity++;
            }
        }

        double media = soma / person.length;
        double porcentage = (quantity * 100) / person.length;

        System.out.println("Altura média: " + media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n" , porcentage);

        for (int i = 0; i < person.length; i++){
            if (person[i].getIdade() < 16){
                System.out.println(person[i].getName());
            }
        }

    }
}
