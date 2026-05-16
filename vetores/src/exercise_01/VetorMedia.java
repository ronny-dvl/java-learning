package exercise_01;

import java.util.Scanner;

public class VetorMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double soma = 0.00;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        double mediaDoVetor = soma / vect.length;

        System.out.printf("MEDIA DO VETOR = %.3f%n", mediaDoVetor);

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < mediaDoVetor) {
                System.out.printf("%.1f%n" , vect[i]);
            }
        }

        sc.close();

    }
}