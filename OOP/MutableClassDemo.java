class MutableClass{
    int a;
    public MutableClass(int a){
        this.a = a;
    }

    void add5(){
        this.a += 5;
    }

    void add10(){
        this.a += 10;
    }
}
public class MutableClassDemo {
    public static void main(String[] args) {
        MutableClass m1 = new MutableClass(10);
        m1.add5();
        System.out.println(m1.a);
        }
}
