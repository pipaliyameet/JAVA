class Rect{
    int length;
    int width;
    String borderCOlor;
    String backgroundColor;

    public Rect(){
        backgroundColor = "White";
    }
}
public class FirstClass{
    public static void main(String[] args){

        Rect obj1 = new Rect();
        obj1.length = 5;      
        obj1.borderCOlor = "Green";
        obj1.backgroundColor = "Black";

        Rect obj2 = new Rect();
        obj2.length = 3;      
        obj2.borderCOlor = "GReen";
        obj2.backgroundColor = "BLack";

        Rect obj3 = new Rect();
        obj3.length = 7;      
        obj3.borderCOlor = "GREen";
        obj3.backgroundColor = "BLAck";

        Rect obj4 = new Rect();
        obj4.length = 6;      
        obj4.borderCOlor = "GREEn";
        obj4.backgroundColor = "BLACk";

        Rect obj5 = new Rect();

        System.out.println(obj5.backgroundColor);
    }
}