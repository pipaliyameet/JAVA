import java.util.Scanner;
public class numpattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int n = sc.nextInt();
        int x = 1;
        for(int i=0 ; i<=n ; i++)
        {
            for(int j=0 ; j<=i ; j++)
            {
                System.out.print(x++ +" ");
            }
            System.out.println("");
        }
    }
}