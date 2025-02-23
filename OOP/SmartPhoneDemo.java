import java.util.Scanner;
class SmartPhone{
    int ram;
    int rom;
    int frontCamera;
    int backCamera;
    String maker;
    String model;

    public SmartPhone(){
        ram = 2;
        rom = 4;
        frontCamera = 30;
        backCamera = 50;
        maker = "Apple";
        model = "13pro";
    }

    public SmartPhone(int ram , int rom){
        this();
        this.ram=ram;
        this.rom=rom;
    }
}
public class SmartPhoneDemo {
    public static void main(String[] args) {

        SmartPhone iphone = new SmartPhone(6 ,5);

        System.out.println(iphone.ram);
        System.out.println(iphone.maker);
    }
}
