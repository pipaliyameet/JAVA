class ImmutableClass{
    int a;
    
    public ImmutableClass(int a){
        this.a = a;
    }

    int add5(){
        return this.a += 5;
    }

    int add10(){
        return this.a += 10;
    }
}
public class ImmutableClassDemo {
    public static void main(String[] args) {
        ImmutableClass m1 = new ImmutableClass(10);
        m1.add5();
        System.out.println(m1.a);
        }
}
