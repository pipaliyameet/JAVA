import java.util.Scanner;
public class SumOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1st number : ");
        String s1 = sc.nextLine();
        System.out.print("Enter a 2nd number : ");
        String s2 = sc.nextLine();
        
        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
        sc.close();
    }
}
