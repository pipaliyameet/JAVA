import java.util.Scanner;
public class Lab2A3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int area = 2 * (length + width);
        System.out.print("area of rectang"+area);
    }
}