import java.util.Scanner;
public class ArrayShorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of array : ");
        int length = sc.nextInt();

        int[] array = new int[length];

        for(int i=0 ; i<array.length ; i++){
            for(int j=0 ;;j++){
                if(array[i]>array[j]){
                    int temp =array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        sc.close();
    }
}
