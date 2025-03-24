class A{
    int i;
    void Demo(){
        System.out.println(i);
    }
}
class B{
    int x;
    int y;
    void Demo(int a, int b){
        x=a+b;
        y=x+b;
    }
}
public class temp {
    public static void main(String[] args){
        int a=2;
        B obj1 = new B();
        obj1.Demo(a,a+1);
        B obj2 = new B();
        obj2.Demo(a,a+1);
        System.out.println(obj1.x+""+obj1.y);
    }
}
