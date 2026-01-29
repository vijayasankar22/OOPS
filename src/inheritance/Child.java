package inheritance;

public class Child extends Parent {
    String std;

   Child(String std) {
        this.std = std;
    }

    public Child(int age, String name, String std) {

       this.std = std;

    }
}
