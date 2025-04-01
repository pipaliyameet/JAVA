class ThreadDemo extends Thread{
    public void run(){
       while (true) { 
        System.out.println("Thred mathod Run");
       }
    }
}
public class Lab11A1_1 {
    public static void main(String[] args) {
        ThreadDemo obj1 = new ThreadDemo();
        obj1.start();

        while (true) { 
            System.out.println("main mehod Run");
            try {
                obj1.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
