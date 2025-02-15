import java.util.Scanner;
public class LAb5C7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of array : ");
        int len = sc.nextInt();
        int[] arr = new int[len];

        for(int i=0 ; i<arr.length ; i++){
            System.out.print("Enter a element :");
            arr[i] = sc.nextInt(); 
        }

        System.out.print("Select a element : ");
        int select = sc.nextInt();

        int len2 = (arr.length-select);
        int[] arr2 = new int[len];
        
        int ele=0;
        for(int j=len2 ; j<=(arr.length-1) ; j++){
            System.out.print(" "+arr[j]);
            arr2[ele]=arr2[j];
        }

        // for(int k=0 ; k<=len2 ; k++){
        //     System.out.print(" "+arr[k]);
        //     arr2[ele]=arr2[k];
        // }
        System.out.println(arr2[ele]);
    }
}