package exercise_04;

import java.util.Scanner;

public class VetorPar {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        int quantity = 0;

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.print("\nNUMEROS PARES: \n");
        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                quantity++;
                System.out.print(vect[i] + " ");
            }
        }
        System.out.print("\nQUANTIDADE DE PARES: " + quantity);

        sc.close();
    }

}
