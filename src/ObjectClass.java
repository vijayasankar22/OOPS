public class ObjectClass {

int num;

    public ObjectClass(int num) {
        this.num = num;
    }

    public int hashCode() {
        return num + 24;
    }
    public boolean equals(Object obj) {
        return obj == this;
    }

    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass(15);
        ObjectClass obj2 = new ObjectClass(2);
        System.out.println(obj1.hashCode());

    }
}

