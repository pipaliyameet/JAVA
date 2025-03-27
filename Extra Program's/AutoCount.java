import java.awt.Robot;
import java.util.Scanner;
public class AutoCount extends Thread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            Robot r1 = new Robot();
            String count = "count = ";
            for(int i=101 ; i<103 ; i++){
                System.out.print(i+" is a : ");
                int temp = sc.nextInt();
                sleep(1000*3);
                if(temp==1){
                    continue;
                }
                else{
                    String s = Integer.toString(i)+ ", ";
                    count = count.concat(s);
                }
            }
            System.out.println(count);
        }catch(Exception e){}
    }
}
