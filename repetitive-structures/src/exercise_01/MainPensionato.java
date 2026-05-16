package exercise_01;

import java.util.Scanner;

public class MainPensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        EstudantesPensionato[] room = new EstudantesPensionato[10];
        System.out.print("Quantos estudantes vão alugar quartos? ");
        int quantidadeAlunos = sc.nextInt();

        for (int i = 0; i < quantidadeAlunos; i++) {
            sc.nextLine();
            System.out.println("\nRent #" + (i + 1) + ":");
            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int quarto = sc.nextInt();

            room[quarto] = new EstudantesPensionato(name, email);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < room.length; i++) {
            if (room[i] != null){
                System.out.println(i + ": " + room[i]);
            }
        }

        sc.close();
    }
}
