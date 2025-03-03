import java.util.Scanner;
public class PrintLongestString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String a = sc.nextLine();

        char c = a.charAt(0);
        System.out.print(a.charAt(0));
        for(int i=1 ; i<a.length() ; i++){
            if(a.charAt(i)!=c){
                System.out.print(a.charAt(i));
            }
            else{
                break;
            }
        }
    }
}
