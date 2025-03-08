import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        Factorial o1 = new Factorial();

        System.out.println(o1.calculateTheFactorial(number));

        sc.close();
    }
    int calculateTheFactorial(int number){
        if(number==0 || number==1){
            return 1;
        }
        else{
            return number * calculateTheFactorial(number - 1);
        }
    }
}