import java.util.Scanner;
public class Lab2C5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter a 2nd number : ");
        int b = sc.nextInt();
        System.out.print("Enter a 3rd number : ");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.print("1st number is largest number");
            }
            else{
                System.out.print("3rd number is largest number");
            }
        }
        else{
            if(b>c){
                System.out.print("2nd number is largest number");
            }
            else{
                System.out.print("3rd number is largest number");
            }
        }
    }
}