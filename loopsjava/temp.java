import java.util.Scanner;
public class temp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
for(int i=n ; i>=0 ; i--)
        {                  
            for(int k=0 ; k<=(n-i) ; k++)
            {
                System.out.print(" ");
            }
            for(int j=0 ; j>=i ; j++)
                if(i==j || j==0)
                {
                    System.out.print("* ");
                }
                else if(i==0)
                {
                    System.out.print("*");
                    break;
                }
                else
                {
                   System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    