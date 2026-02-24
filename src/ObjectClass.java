

public class ObjectClass {

int num;

    public ObjectClass(int num) {
        this.num = num;
    }

    public int hashCode() {
        return num + 24;
    }
    public boolean equals(Object obj) {
        return ((ObjectClass)obj).num == this.num;
    }

    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass(15);
        ObjectClass obj2 = new ObjectClass(5);
        System.out.println(obj1.hashCode());

        System.out.println(obj1.equals(obj2));

        System.out.println(obj2 instanceof ObjectClass);
        System.out.println(obj1.getClass());

    }
}

