import java.util.Scanner;
public class Lab10A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a student number : ");
        int numberOfStudent = sc.nextInt();

        int[] mark = new int[5];

        int total =0;

        try{
            for(int i=0 ; i<numberOfStudent ; i++){
                System.out.print("Enter a student no "+(i+1)+" mark : ");
                mark[i] = sc.nextInt();
                total += mark[i];
            }
        }catch(ArithmeticException ae){
            System.out.println("ples provide student ");
        }catch(ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Enter only 5 number of student");
        }

        System.out.println("Average of mark is = "+(total/numberOfStudent));

        System.out.println("Your program is complet");
    }
}