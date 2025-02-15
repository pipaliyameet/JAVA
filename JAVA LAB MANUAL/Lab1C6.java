import java.util.Scanner;
public class Lab1C6{
    public static void main(String[] args){
        System.out.print("Enter a character  : ");
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        if(n == 'A' || n == 'E' || n == 'I' || n == 'O' || n == 'U' || n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u'){
            System.out.println("this character is vowels");
        }
        else{
            System.out.println("this character is conconent");
        }
    }
}