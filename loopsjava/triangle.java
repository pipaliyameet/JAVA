import java.util.Scanner;
public class triangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=0 ; i<=n ; i++)
        {
            if(i == n)
            {
                   for(int j=0 ; j<=i ; j++)
                    {
                       if(j==i)
                       {
                         System.out.print("*");
                       }
                       else
                       {
                         System.out.print("**");
                       }
                    }   
            }
            else
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
        }
    }
}