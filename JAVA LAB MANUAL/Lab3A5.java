import java.util.Scanner;
public class Lab3A5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int count =0;
        for(int i=2 ; i<n ; i++)
        {
            if(n % i == 0)
            {
                count++;
            }
            else{
                continue;
            }
        }
        if(count == 0)
        {
            System.out.print("Given number is prime number");
        }
        else{
            System.out.print("Given number is not prime number");
        }
    }
    
}
