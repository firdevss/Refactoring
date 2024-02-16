public class ProductDetails {


    private String name;
    private String description;
    private String category;

    public ProductDetails(String name, String description, String category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public void displayProductDetails() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);
    }

}
