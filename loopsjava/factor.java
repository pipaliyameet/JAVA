import java.util.Scanner;
public class factor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i=2;
        System.out.print("this number factors is = ");
        while(i <= n)
        {
            if(n % i == 0)
            {
                System.out.print(i);
                System.out.print(" , ");
            ++i;
            }
            i++;
        }
    }
} 