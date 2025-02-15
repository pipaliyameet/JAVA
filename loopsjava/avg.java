import java.util.Scanner;
public class avg
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        float n = sc.nextFloat();
        float i=1f;
        float sum = 0f;
        System.out.print("average of this number is = ");
        while(i <= n)
        {
            sum = sum + i;
            i++;
        }
        float avg = (sum / n);
        System.out.print(avg);
    }
} 