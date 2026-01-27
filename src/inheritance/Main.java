package inheritance;

public class Main {
    public static void main(String[] args) {
        Parent p1 = new Parent(32,"John");
        Child c1 = new Child("B.E");
        c1.name = "Vijay";
        System.out.println(p1.name);
        System.out.println(c1.name);

        Child c2 = new Child (22,"Cat","12");
        System.out.println(c2.age);
        System.out.println( " "+c2.name+" "+c2.std);


        Parent p3 = new Child(28,"Dhanush","4");
        System.out.println(p3.age);

//        Car BMW = new Car();
//        System.out.println(BMW.model);



    }
}
