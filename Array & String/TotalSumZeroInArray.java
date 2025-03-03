/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. */

import java.util.Scanner;
public class TotalSumZeroInArray{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of array : ");
        int length = sc.nextInt();

        int[] array = new int[length];

        for(int i=0 ; i<array.length ; i++){
            System.out.print("Enter elemrnt number"+ (i+1) +" : ");
            array[i] = sc.nextInt(); 
        }
        int sum=0;
        for(int i=0 ; i<array.length ; i++){
            sum += array[i]+array[i+1];
            
        }
        sc.close();
    }
}
