class Scope{
    
    String a = "Scope main variable";
    
    public void printA(String a){
        this.a=a;
    }
}
public class ScopeDemo {
    public static void main(String[] args){
        Scope o1 = new Scope();

        o1.printA("meet");

        System.out.println(o1.a);
    }
}