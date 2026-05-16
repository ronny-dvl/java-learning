package exercise_03;

import java.util.Scanner;

public class ExercicioMatriz_3 {
    public static void main(String[] rgs) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] mat = new int[n][n];


        int posicaoXmaiorV = 0;
        int posicaoYmaiorV = 0;
        int posicaoXmenorV = 0;
        int posicaoYmenorV = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int maiorValor = mat[0][0];
        int menorValor = mat[0][0];


        System.out.println("MATRIZ:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println(mat[i][j]);
                if (mat[i][j] > maiorValor) {
                    maiorValor = mat[i][j];
                    posicaoXmaiorV = i;
                    posicaoYmaiorV = j;
                }

                if (mat[i][j] < menorValor){
                    menorValor = mat[i][j];
                    posicaoXmenorV = i;
                    posicaoYmenorV = j;
                }
            }
        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posição maior valor [" + posicaoXmaiorV + "]" + "[" + posicaoYmaiorV + "]");
        System.out.println("Posição menor valor [" + posicaoXmenorV + "]" + "[" + posicaoYmenorV+ "]");

        sc.close();
    }
}
