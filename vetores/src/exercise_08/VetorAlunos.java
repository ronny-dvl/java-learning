package exercise_08;

import java.util.Scanner;

public class VetorAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos vai digitar? ");
        int n = sc.nextInt();


        AlunosVetor[] alunos = new AlunosVetor[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            String name = sc.nextLine();
            double nota1s = sc.nextDouble();
            double nota2s = sc.nextDouble();

            alunos[i] = new AlunosVetor(name, nota1s, nota2s);
        }

        System.out.println("Alunos Aprovados:");
        for (int i = 0; i < n; i++) {

            double total = alunos[i].somaNotas();
            if (total >= 6.0) {
                System.out.println(alunos[i].getName());
            }
        }
        sc.close();
    }
}