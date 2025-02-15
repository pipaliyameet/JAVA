import java.util.Scanner;
class Time{
    int hour;
    int minute;
    public Time(int hour , int minute){
        this.hour = hour;
        this.minute = minute;
    }
    public void add(Time t2){
        hour = this.hour+t2.hour;
        minute = this.minute+t2.minute;
        if (minute>=60){
            minute = minute-60 ;
            hour++;
        }
        System.out.println("Time is "+hour +" : "+minute);
    }
}
public class Lab6A2 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1st Time hour : ");
        int h1 = sc.nextInt();
        System.out.print("Enter a 1st Time minute : ");
        int h2 = sc.nextInt();

        Time t1 = new Time(h1 ,h2);

        System.out.print("Enter a 2st Time hour : ");
        int H1 = sc.nextInt();
        System.out.print("Enter a 2st Time minute : ");
        int H2 = sc.nextInt();

        Time t2 = new Time(H1 , H2);

        t1.add(t2);
        
    }
}
