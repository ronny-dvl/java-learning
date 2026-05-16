package Classroom;

import java.util.Scanner;

public class VetorPrimitive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            double altura = sc.nextDouble();
            vect[i] = altura;
        }

        double soma = 0.00;
        for (double obj: vect) {
            soma += obj;
        }

        double result = soma / vect.length;

        System.out.println(result);


    }
}
