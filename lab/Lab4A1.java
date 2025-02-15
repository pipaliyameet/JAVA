import java.util.Scanner;
public class Lab4A1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a stetment :");
        String s1 = sc.nextLine();
        int len = s1.length();
        
        int sum = 0;
        int count = 0;
        for(int j=(len-1) ; j>=0 ; j--){
            char ch = s1.charAt(j);
            if( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch=='u'){
                count++;
            }
            else{
                sum++;
            }
        }
        System.out.println(count+" ");
        System.out.print(sum);
    }
}