import java.util.Scanner;
public class Lab2B4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a Fahrenheit : ");
       int F = sc.nextInt();
       int C = (F - 32) * 5/9;
       System.out.print(C);
    }
}
