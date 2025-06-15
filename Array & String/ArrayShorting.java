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
            for(int j=i ; j<a.length ; j++){
                if(a[j]<a[i]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                else{
                    a[i]=a[i];
                }
            }
        }
        for(int i=0 ;i<a.length ;i++){
            System.out.print("Element number "+i+"is = "+a[i]+"\n");
        }
    }
}
