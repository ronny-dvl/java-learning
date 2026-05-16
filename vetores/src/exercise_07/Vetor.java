package exercise_07;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ProductVetor[] vect = new ProductVetor[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();

            vect[i] = new ProductVetor(name, price, quantity);

        }

        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getQuantity();
        }

        double result = soma / vect.length;

        System.out.println(result);

        sc.close();
    }

}
