import java.util.Scanner;
public class Lab5A5{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String n = sc.nextLine();
        int len = n.length();

        for(int i=0 ; i<=len ; i++){

            int k=0;

            for(int j=0 ; j<i ; j++){

                char ch = n.charAt(k);
                System.out.print(ch);

                k++;
            }
            
            System.out.println("");
        }
    }
}