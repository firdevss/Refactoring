public interface TransactionObserver {
    void update(String accountNumber, String action, double amount);
}
