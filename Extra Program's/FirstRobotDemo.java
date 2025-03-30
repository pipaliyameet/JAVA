import java.awt.Robot;

public class FirstRobotDemo extends Thread{
    public static void main(String[] args){
        try{
            Robot r1 = new Robot();
            sleep(1000);
            r1.mouseMove(900,600);
        }catch(Exception e){}
        
    }
}

