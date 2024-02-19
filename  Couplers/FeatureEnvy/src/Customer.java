public class Customer {
    private String name;
    private Address address;

    // Constructor, getters, and setters for name and address

    public String getAddressCity() {
        return address.getCity();
    }

    public String getAddressStreet() {
        return address.getStreet();
    }

    public String getAddressPostalCode() {
        return address.getPostalCode();
    }


}
