import java.util.Scanner;
public class LongrstString{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String a = sc.nextLine();
        int count =1;
        char c = a.charAt(0);
        for(int i=1 ; i<a.length() ; i++){
            if(a.charAt(i)!=c){
                count++;
            }
            else{
                break;
            }
        }
        System.out.print("Maximum length is = "+count);
    }
}
