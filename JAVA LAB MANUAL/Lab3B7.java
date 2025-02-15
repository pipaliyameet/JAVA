import java.util.Scanner;
public class Lab3B7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a = 0;
        int d = n;
        int count = 0 ;
        while (n != 0) {
            count = count + 1 ;
            n /= 10;
        }
        for(int i=1 ; i<=count ; i++)
        {
            a = a*10 + (n % 10);
        }
        if(d == a)
        {
            System.out.print("Given number is palindrome");
        }
        else{
            System.out.print("Given number is not palindrome");
        }
    }
}