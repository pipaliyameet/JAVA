import java.util.Scanner;
public class ArrayShorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of array : ");
        int length = sc.nextInt();

        int[] array = new int[length];

        for(int i=0 ; i<array.length ; i++){
            System.out.print("Enter a element no "+(i+1)+" and index no "+i+" : ");
            array[i] = sc.nextInt();
        }

        for(int i=0 ; i<array.length ; i++){
            for(int j=i ; j<array.length ;j++){
                if(array[i]>array[j]){
                    int temp =array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            System.out.print(array[i]+"\t");
        }
        sc.close();
    }
}
