interface A{
int a=5;
public void sum();
}
interface  A1 extends A{
    int b=5;
    public void multi();
}
interface A2 extends A{
    int c=5;
    public void divid();
}
interface  A12 extends   A1 , A2{
    int d=5;
    public void power();
} 
class B implements  A12{

    public void sum(){}
    public void multi(){}
    public void divid(){}
    public void power(){}
}
public class Lab8A2 {
    public static void main(String[] args) {
        
    }
}
