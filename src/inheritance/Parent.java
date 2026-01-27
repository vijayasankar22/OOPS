package inheritance;

public class Parent {
   int age;
    String name;
    boolean gender;


    public Parent() {

    }

    public Parent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Parent(int age, String name, boolean gender) {
        this(age,name);
        this.gender = gender;
    }
}


