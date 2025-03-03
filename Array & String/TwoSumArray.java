/*Given an array of integers nums and an integer target, return indices 
of the two numbers such that they add up to target. */

import java.util.Scanner;
public class TwoSumArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter a length of array : ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0 ; i<array.length ; i++){
            System.out.print("Enter a element number"+ (i+1) +" : ");
            array[i] = sc.nextInt();
        }

        System.out.print("Enter a target of sum : ");
        int target = sc.nextInt();

        for(int i=0 ; i<array.length ; i++){

            for(int j=0 ; j<array.length ; j++){
                int sum = array[i]+array[j];
                if(sum==target){
                    System.out.print("["+i+","+j+"]");
                    i=539756990;
                    break;
                    }
                }
            if(i==539756990){
                break;
            }
        }
        sc.close();
    }
}
