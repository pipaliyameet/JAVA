import java.util.Scanner;

public class Lab3A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1st subject mark : ");
        int s1 = sc.nextInt();
        System.out.print("Enter a 2nd subject mark : ");
        int s2 = sc.nextInt();
        System.out.print("Enter a 3rd subject mark : ");
        int s3 = sc.nextInt();
        System.out.print("Enter a 4th subject mark : ");
        int s4 = sc.nextInt();
        System.out.print("Enter a 5th subject mark : ");
        int s5 = sc.nextInt();
        int Percentage = ((s1 + s2 + s3 + s4 + s5) / 5);
        if (Percentage >= 60) {
            System.out.print("First division ");
        } else if (Percentage >= 50 && Percentage <= 59) {
            System.out.print("Second division ");
        } else if (Percentage >= 40 && Percentage <= 49) {
            System.out.print("Third division ");
        } else if (Percentage < 40) {
            System.out.print("Fail ");
        }
    }
}
