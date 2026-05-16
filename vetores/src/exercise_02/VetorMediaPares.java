package exercise_02;

import java.util.Scanner;

public class VetorMediaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        int soma = 0;
        int quantity = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();

            if (vect[i] % 2 == 0) {
                soma += vect[i];
                quantity++;
            }
        }

        if (quantity > 0) {

            int media = soma / quantity;
            System.out.println("MEDIA DOS PARES = " + media);

        } else {
            System.out.println("NENHUM NUMERO PAR");
        }
    }
}