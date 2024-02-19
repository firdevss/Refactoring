public class OrderRefactored {
    private static CustomerRefactored customer;

    public OrderRefactored(CustomerRefactored customer) {
        this.customer = customer;
    }

    public static String getCustomerFullAddress() {
        return customer.getFullAddress();
    }
}
