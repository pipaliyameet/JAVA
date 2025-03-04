import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int y = sc.nextInt();

        if(y%4==0 || y%400==0 || y%100==0){
            System.out.print("Enter year is leap year");
        }
        else{
            System.out.print("Enter year is non leap year");
        }
        sc.close();
    }
}
