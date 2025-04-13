import java.util.Scanner;
public class ArrayShorting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of array : ");
        int l = sc.nextInt();
        int[] a = new int[l];
        for(int i=0 ; i<a.length ; i++){
            System.out.print("Enter element number "+(i+1)+" : ");
            a[i]=sc.nextInt();
        }
        
        for(int i=0 ; i<a.length ; i++){
            int count=0;
            for(int j=i ; j<a.length ; j++){
                if(j<i){
                    count = j;
                }
                else if(j>i){
                    count = i;
                }
                else if(j==(a.length-1)){
                    count = j;
                }
            }
            System.out.print(count+" ");
        }
    }
}