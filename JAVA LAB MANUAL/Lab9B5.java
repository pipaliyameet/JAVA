// Write a Java program to create an interface Shape with the getArea() method. Create 
// three classes Rectangle, Circle, and Triangle that implement the Shape interface. 
// Implement the getArea() method for each of the three classes. 
import java.util.Scanner;
interface Shape{
    double getArea();
}
class Triangle implements Shape{
    float hight;
    float base;
    public double getArea(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hight : ");
        hight= sc.nextFloat();
        System.out.print("Enter base : ");
        base= sc.nextFloat();
        double area = (0.5f*hight*base);
        return area;
    }
}
class Circle implements Shape{
    double redius;
    public double getArea(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius : ");
        redius= sc.nextDouble();
        double area = Math.PI*Math.sqrt(redius);
        return area;
    }
}
class Rectangle implements Shape{
    double hight;
    double base;
    public double getArea(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hight : ");
        hight= sc.nextDouble();
        System.out.print("Enter base : ");
        base= sc.nextDouble();
        double area = (2*(hight+base));
        return area;
    }
}
public class Lab9B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("if you clculet rectengle area so enter 1 or triangle so enter 2 or circle so enter 3 : ");
    

    }
}
