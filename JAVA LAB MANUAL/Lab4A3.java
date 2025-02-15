import java.util.Scanner;
public class Lab4A3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<arr.length ; i++){
            System.out.print("Enter a element :");
            arr[i] = sc.nextInt(); 
        }
        for(int i=arr.length-1 ; i>=0 ; i--){
            System.out.println("Element is = "+arr[i]);
        }
    }
}