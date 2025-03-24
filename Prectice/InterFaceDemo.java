import java.util.Scanner;
interface Vehical{
    int gare = 6;
    public void stop();
}
interface Bike extends Vehical{
    public void speedUp();
}
class Splender implements Bike{
    public void stop(){}
    public void speedUp(){
        System.out.println(gare);
    }
    
}
public class InterFaceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Splender obj1 = new Splender();
        obj1.speedUp();
        sc.close();
    }
}
