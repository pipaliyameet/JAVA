
import java.util.Scanner;
public class Lab4B4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a stetment :");
        String c = sc.nextLine();
        int len = c.length();
        System.out.println("Length Of String is = "+len);

        for(int i=(len/2) ; i<=(len-1) ; i++){

            char ch=c.charAt(i);
            System.out.print(ch);
        }
    }
}
