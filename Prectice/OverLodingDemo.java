class OverLode{
    
    OverLode(){
        int a=2;
        int b=2;
        System.out.print(a+b);
    }

    void OverLode(){
        int a=3;
        int b=2;
        System.out.print(a+b);
    }
}
public class OverLodingDemo {
    public static void main(String[] args){

        OverLode obj1 = new OverLode();
    }
}
