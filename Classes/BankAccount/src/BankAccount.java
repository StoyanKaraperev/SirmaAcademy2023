import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;

    private double balance;
    private double interestRate;

    public BankAccount(){
        this.id = count.incrementAndGet();
    }

    public BankAccount(int id, double amount){
        this.id = id;
        this.balance = amount;
    }

    public void deposit(double amount){
        System.out.printf("Deposited %d to ID%d", this.balance, this.id);
    }

    public void printNewAccount(){
        System.out.printf("Bank account ID%d created", this.id);
    }
}
