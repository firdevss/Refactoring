public class Order {

    private CustomerRefactored customer;

    public Order(CustomerRefactored customer) {
        this.customer = customer;
    }

    public String getCustomerAddress() {
        return customer.getFullAddress();
    }
}
