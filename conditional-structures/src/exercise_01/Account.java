package exercise_01;

public class Account {

    private static final double WITHDRAW_FEE = 5.00;
    private final int accountNumber;
    private String holder;
    private double balance;

    public Account(int accountNumber, String holder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        depositBalance(initialDeposit);
    }

    public Account(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void depositBalance(double deposit) {
        balance += deposit;
    }

    public void withDrawBalance(double withdraw) {
        balance -= (withdraw + WITHDRAW_FEE);
    }

    public String toString(){
        return "Account "
                + accountNumber
                + ", Holder: "
                + holder
                + String.format(", Balance: $ %.2f"
                , balance);
    }

}
