public class CustomerRefactored {
    private Address address;

    public CustomerRefactored(Address address) {
        this.address = address;
    }

    public String getFullAddress() {
        return address.getFullAddress();
    }
}
