import java.util.Scanner;
public class evensum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i=1;
        int sum = 0;
        System.out.print("sum of the even number is = ");
        while(i <= n)
        {
            if(i % 2 ==0)
            {
            sum = sum + i;
            }
            i++;
        }
        System.out.print(sum);
    }
} 