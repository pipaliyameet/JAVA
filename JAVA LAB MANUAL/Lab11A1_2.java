class RunableInterFaceDemo implements Runnable{
    public void run(){
        while(true){
            System.out.println("RunableInterFace method");
        }
    }
}
public class Lab11A1_2 {
    public static void main(String[] args) {
        // RunableInterFaceDemo obj1 ;
        Thread obj2 = new Thread(new RunableInterFaceDemo());
        obj2.start();
        while (true) {
            System.out.println("main method exicute");
            try {
                obj2.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
