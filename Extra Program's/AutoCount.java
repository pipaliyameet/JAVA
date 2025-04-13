import java.awt.Robot;
import java.awt.event.*;
import java.util.*;         
class GiveInput extends Thread {

    public GiveInput(){
		try{
			Robot r = null;
		}catch(Exception e){}
	}
    public void run(){
        Robot r = null;
        try { 
            while (true) {
				sleep(1000);
				if(new Date().getTime() - ((Date) AutoCount.d1).getTime()>1000){
					r.keyPress(KeyEvent.VK_0);
					sleep(5);
					r.keyRelease(KeyEvent.VK_0);
					r.keyPress(KeyEvent.VK_ENTER);
					sleep(5);
					r.keyRelease(KeyEvent.VK_ENTER);
				}
			}
        } catch (Exception e) {}
    }
}

public class AutoCount {
    public static Object d1;

    public static void main(String[] args) {
        GiveInput obj1 = new GiveInput();

        Scanner sc = new Scanner(System.in);
        
        try{
            
            String count = "count = ";
            obj1.start();

            for(int i=101 ; i<105 ; i++){

                Date d1 = new Date();
                System.out.print(i+" is a : ");
                int temp = sc.nextInt();
                
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





// import java.awt.AWTException;
// import java.awt.Robot;
// import java.awt.event.*;
// import java.util.Scanner;