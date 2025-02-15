import java.util.Scanner;
public class diamond4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=0 ; i<=n ; i++)
        {                  
            for(int k=0 ; k<=(n-1-i) ; k++)
            {
                System.out.print(" ");
            }
            for(int j=0 ; j<=i ; j++)
            {
                if(i==j || j==0)
                {
                    System.out.print("* ");
                }
                else
                {
                   System.out.print("  ");
                }
            }
            System.out.println("");
        }
        for(int i=n ; i>=0 ; i--)
        {                  
            for(int k=0 ; k<=(n-i) ; k++)
            {
                System.out.print(" ");
            }
            for(int j=0 ; j>=i ; j++)
            {
                if(i==0)
                {
                    System.out.print("*");
                    break;
                }
                else if(i==j || j==0)
                {
                    System.out.print("* ");
                }
                else
                {
                   System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}