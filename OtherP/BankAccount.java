package OtherP;

import java.time.LocalDateTime;

public class BankAccount {
    String name;
    LocalDateTime opened;
    int balance;

    @Override
    public String toString() {
        return name + opened + balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.name = "Cyprien";
        account.opened = LocalDateTime.now();
        account.balance = 1000;
        System.out.println(account.toString());
    }
}
