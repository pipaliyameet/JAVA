import java.util.Scanner;
public class PalindromeOfTwoString {
    static String s1;
    static String s2;
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String : ");
        s1 = sc.nextLine();
        System.out.print("Enter 2nd String : ");
        s2 = sc.nextLine();
        
        PalindromeOfTwoString obj1 = new PalindromeOfTwoString();

        System.out.println(obj1.checkStringIsPalindrome(s1,s2));

        sc.close();
    }

    static String checkStringIsPalindrome(String s1 , String s2){

        int j=(s2.length()-1);
        int temp=0;

        if(s1.length()==s2.length()){
            for(int i=0 ; i<s1.length() ; i++){
                if(s1.charAt(i)==s2.charAt(j)){
                    temp=0;
                    j--;
                    continue;
                }
                else{
                    temp=87;
                    break;
                }              
            }
        }
        else{
            temp=87;
        }

        if(temp==0){
            return "true";
        }
        else{
            return "false";
        }
    }
}
