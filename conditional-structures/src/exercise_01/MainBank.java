package exercise_01;
import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        Account account;

        if (response == 'y' || response == 'Y') {
            System.out.println("\nEnter a deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, holder, initialDeposit);

        } else {
            account = new Account(accountNumber, holder);
        }

        System.out.println("\nAccount data: " + "\n" + account);

        System.out.print("\nEnter a deposit value: ");
        double deposit = sc.nextDouble();
        account.depositBalance(deposit);

        System.out.print("\nUpdated account data: " + "\n" + account);

        System.out.print("\nEnter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withDrawBalance(withdraw);

        System.out.print("\nUpdated account data: " + "\n" + account);

        sc.close();
    }
}
