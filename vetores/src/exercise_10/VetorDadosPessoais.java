package exercise_10;

import java.util.Scanner;

public class VetorDadosPessoais {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();
        double menorAltura;
        double maiorAltura;
        double soma = 0.00;
        double media;
        int contF = 0;
        int contM = 0;

        DadosPessoais[] person = new DadosPessoais[n];

        for (int i = 0; i< person.length; i++){
            System.out.print("Altura da " + (i + 1) + "a pessoa:");
            double altura = sc.nextDouble();
            sc.nextLine();
            System.out.print("Genero da " + (i + 1) + "a pessoa:");
            String genero = sc.next();

            person[i] = new DadosPessoais(altura, genero);

            if (person[i].getGenero().equalsIgnoreCase("F")){
                contF++;
                soma += person[i].getAltura();
            }
            else {
                contM++;
            }
        }

        menorAltura = person[0].getAltura();
        maiorAltura = person[0].getAltura();

        for (int i = 0; i< person.length; i++){
            if (person[i].getAltura() < menorAltura){
                menorAltura = person[i].getAltura();
            }
        }
        for (int i = 0; i< person.length; i++){
            if (person[i].getAltura() > maiorAltura){
                maiorAltura = person[i].getAltura();
            }
        }

        media = soma / contF;
        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n" , media);
        System.out.println("Numero de homens = " + contM);

        sc.close();
    }
}
