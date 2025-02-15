import java.util.Scanner;
class circle{
    double Redious ;

    public void area(double Redious){

        double areaOfCircle = Math.PI*Redious ;
        System.out.println("area of circle is = "+areaOfCircle);
    }
}
public class Lab6A1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        circle r = new circle();
        System.out.print("Enter a Redious :");
        double R = sc.nextInt();
        r.area(R);
    }
}
