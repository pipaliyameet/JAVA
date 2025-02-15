import java.util.Scanner;
public class Lab4A2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<arr.length ; i++){
            System.out.print("Enter a element :");
            arr[i] = sc.nextInt(); 
        }
        int sum=0;
        for(int i=0 ; i<arr.length ; i++){
            sum = sum + arr[i];
        }
        int avg = (sum / n);
        System.out.print("average is = "+avg);
    }
}
