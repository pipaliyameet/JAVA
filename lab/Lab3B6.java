import java.util.Scanner;
public class Lab3B6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int y = sc.nextInt();
        int temp = (y/4);
        if(temp % 2 == 0)
        {
            System.out.print("This year is leap year");
        }
        else{
            System.out.print("This year is not leap year");
        }
    }
}


