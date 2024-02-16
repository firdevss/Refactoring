import java.util.ArrayList;
import java.util.List;
public class AccountRefactored {
    private String accountNumber;
    private double balance;
    private List<TransactionObserver> observers;

    public AccountRefactored(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.observers = new ArrayList<>();
    }

    public void addObserver(TransactionObserver observer) {
        observers.add(observer);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
            notifyObservers("withdraw", amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    private void notifyObservers(String action, double amount) {
        for (TransactionObserver observer : observers) {
            observer.update(accountNumber, action, amount);
        }
    }

}
