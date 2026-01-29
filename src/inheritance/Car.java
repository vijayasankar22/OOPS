package inheritance;

public class Car extends FourWheel {
    int model;
    int price;
    String brand;



    Car(){
        super.type = "Car";
    }

    public Car(String type, int model, int price, String brand) {
        super(type);
        this.model = model;
        this.price = price;
        this.brand = brand;
    }

    public Car(int model, int price, String brand) {
        this.model = model;
        this.price = price;
        this.brand = brand;
    }
}
