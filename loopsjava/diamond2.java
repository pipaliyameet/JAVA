import java.util.Scanner;
public class diamond2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++)
        {
            if(i != 0)
            {
                for(int m=0 ; m<i ; m++)
                {
                    System.out.print(" ");
                }
            }
            for(int j=n ; j>i ; j--)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int i=1 ; i<=n ; i++)
        {
            for(int k=0 ; k<=(n-1-i) ; k++)
            {
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}