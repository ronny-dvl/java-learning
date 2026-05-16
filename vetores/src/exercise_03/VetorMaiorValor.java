package exercise_03;

import java.util.Scanner;

public class VetorMaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];


        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        double maiorValor = vect[0];
        int posicao = 0;
        for (int i = 1; i < vect.length; i++) {
            if (vect[i]> maiorValor){
                maiorValor = vect[i];
                posicao = i;
            }
        }

        System.out.print(maiorValor + " " + posicao);


    }
}
