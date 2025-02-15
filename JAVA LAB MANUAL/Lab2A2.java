import java.util.Scanner;
public class Lab2A2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("\nEnter a number : ");
        int b = sc.nextInt();
        int ans;
        if(str.equals("+"))
        {
            ans = (a + b);  
            System.out.println(ans);
        }
        if(str.equals("-"))
        {
            ans = (a - b); 
            System.out.println(ans);
        }
        if(str.equals("*"))
        {
            ans = (a * b); 
            System.out.println(ans);
        }
        if(str.equals("/"))
        {
            ans = (a / b); 
            System.out.println(ans);
        }
    }
}