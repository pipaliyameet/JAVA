import java.util.Scanner;
public class Ex1{
    public static void main(String[] args){
        System.out.print("Enter a basic salary : ");
        Scanner sc = new Scanner(System.in);
        int bs = sc.nextInt();
        if(bs > 1500){
            int gs = bs + (1500 / 10) + (1500/90);
            System.out.print("Enter a gross salary : "+gs);
        }
        else{
            int gs = bs + 500 + (1500 / 98);
            System.out.print("Enter a gross salary : "+gs);
        }
    }
}