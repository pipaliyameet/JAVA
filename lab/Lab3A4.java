import java.util.Scanner;
public class Lab3A4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter a Secont number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter a Third number : ");
        int n3 = sc.nextInt();
        int max = 
        (n1>n2 ? (n1>n3 ?  n1  :  n3) : (n2>n3) ?  n2 :  n3 );
        System.out.print("largest number is "+max);
    }
}
