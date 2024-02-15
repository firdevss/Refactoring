import javax.naming.Name;

public class Item {

    private String name;
    private double price;

    public Item(double price,String name) {
      this.price = price;
      this.name=name;
    }
  public Item() {

  }


  public double getPrice() {
      return price;
    }


  public String getName() {
    return name;
  }

}
