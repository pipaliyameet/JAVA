import java.util.Scanner;
public class pyramid3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++)
        {
            for(int k=0 ; k<=(n-1-i) ; k++)
            {
                System.out.print("  ");
            }
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}