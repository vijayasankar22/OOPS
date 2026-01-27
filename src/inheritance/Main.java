package inheritance;

public class Main {
    public static void main(String[] args) {
        Parent p1 = new Parent(32,"John");
        Parent p2 = new Child("B.E");
        System.out.println(p1.name);
        System.out.println(p2.name);


    }
}
