package inheritance;

public class FourWheel extends Vehicle {
    String type;

    public FourWheel(String type) {

        super.type = type;
        super.wheels =4;
    }

    FourWheel(){

    }

}
