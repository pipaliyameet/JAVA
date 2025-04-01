import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Temp2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a some....");
        try{
            Robot r = new Robot();
            Thread.sleep(5000);
            try {
                r.keyPress(KeyEvent.VK_0);
                Thread.sleep(300);
                r.keyRelease(KeyEvent.VK_0);

                Thread.sleep(3000);
            } catch (Exception e) {}
            
        System.out.print("program is end");
        }catch(Exception e){}
    }
}

