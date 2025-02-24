import java.util.Scanner;
class Student{
    int rollNo;
    String name;
    static String collageName;

    public Student(){
        collageName = "Darshan uni.";
    }

    static void printStar(){
        System.out.println("************");
    }

    static int addTwo(int n1 , int n2){
        return n1+n2;
    }
}
public class StaticDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student o1 = new Student();
        int a = Student.addTwo(3,5);
        System.out.println(a);
        // Student o2 = new Student();
        // Student o3 = new Student();
        // Student o4 = new Student();
        // Student o5 = new Student();

        // Student.collageName = "DIET";

        // System.out.println(o1.collageName);
        // System.out.println(o2.collageName);
        // System.out.println(o3.collageName);
        // System.out.println(o4.collageName);
        // System.out.println(o5.collageName);

        sc.close();
    }
}
