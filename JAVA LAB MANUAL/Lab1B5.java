import java.util.Scanner;
 public class Lab1B5{
    public static void main(String[] args){
         System.out.print("Enter a meter : ");
        Scanner sc = new Scanner(System.in);
        float meter = sc.nextInt();
        float feet = meter * (3.28f);
        System.out.println("\nfeet : "+feet);
    }
 }