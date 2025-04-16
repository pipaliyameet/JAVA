class base {
    
    base() {
        System.out.println("i am a base classs defult constructor !!");
    }

    base(int x) {
        this();
        System.out.println("i am a base class perameterized constrctur and value is:" + x);
    }
}

class derived extends base {

    derived() {
        this(1,2);
    }

    derived(int x, int y) {
        super(x);
        System.out.println("i am a derived class perameterized constrctur and value is:" + x + " " + y);
    }
}

public class OverLode2 {
    public static void main(String[] args) {
        derived d = new derived();
    }
}