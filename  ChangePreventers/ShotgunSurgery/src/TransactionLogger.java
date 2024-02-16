public class TransactionLogger implements TransactionObserver {
    @Override
    public void update(String accountNumber, String action, double amount) {
        // Logging transaction details
        System.out.println("Transaction logged: Account Number - " + accountNumber + ", Action - " + action + ", Amount - " + amount);
    }
}
