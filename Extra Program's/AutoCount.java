import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.*;
import java.util.Scanner;
class GiveInput extends Thread {
    public void run(){
        Scanner sc = new Scanner(System.in);
        
        try{
            String count = "count = ";
            for(int i=101 ; i<105 ; i++){
                System.out.print(i+" is a : ");
                int temp = sc.nextInt();
                if(temp!=1){
                    try {
                    Robot r = new Robot();
                    sleep(2000);
                    r.keyPress(KeyEvent.VK_0);
                    sleep(100);
                    r.keyRelease(KeyEvent.VK_0);
                    } catch (InterruptedException ex) {} catch (AWTException ex) {}
                }
                if(temp==1){
                    continue;
                }
                else{
                    String s = Integer.toString(i)+ ", ";
                    count = count.concat(s);
                }
                System.out.println("");
            }
            System.out.println(count);
        }catch(Exception e){}
    }
    
}
public class AutoCount {
    public static void main(String[] args) {
        GiveInput obj1 = new GiveInput();

        obj1.start();
    }
}





// import java.awt.AWTException;
// import java.awt.Robot;
// import java.awt.event.*;
// import java.util.Scanner;