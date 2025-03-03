/*Given two sorted arrays nums1 and nums2 of size m and n respectively, 
return the median of the two sorted arrays. */

import java.util.Scanner;
public class MedianOfTwoSortedArrays{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of 1st sorted array : ");
        int l1 = sc.nextInt();
        System.out.print("Enter a length of 2nd sorted array : ");
        int l2 = sc.nextInt();

        int l3 = l1+l2;
        
        int[] array1 = new int[l1];
        int[] array2 = new int[l2];
        int[] array3 = new int[l3];

        System.out.println("~ Enetr a element of 1st sorted array ~");
        for(int i=0 ; i<array1.length ; i++){
            System.out.print("Enter elemrnt number"+ (i+1) +" : ");
            array1[i] = sc.nextInt(); 
        }

        System.out.println("~ Enetr a element of 2nd sorted array ~");
        for(int i=0 ; i<array2.length ; i++){
            System.out.print("Enter elemrnt number"+ (i+1) +" : ");
            array2[i] = sc.nextInt(); 
        }
        int j=0;
        int k=0;
        for(int i=0 ; i<array3.length ; i++){
            if(array1[k]<array2[j]){
                if(k<array1.length){
                    array3[i] = array1[k];
                    k++;
                }
            }
            else{
                if(j<array2.length){
                    array3[i]=array2[j];
                    j++;
                }
            }
        }

        System.out.print("[");
        for(int i=0 ; i<array3.length ; i++){
            System.out.print("  "+array3[i]);
        }
        System.out.print("]");
        sc.close();
    }
}