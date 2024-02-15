public class CarRefactoredPrimitiveObsessin {
    private Make make;
    private Model model;
    private Year year;
    private Price rentalPrice;

    public CarRefactoredPrimitiveObsessin(Make make, Model model, Year year, Price rentalPrice) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalPrice = rentalPrice;
    }

    public String toString() {
        return year.getValue() + " " + make + " " + model + " - Rental Price: " + rentalPrice;
    }

}
