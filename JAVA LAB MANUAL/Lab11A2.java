class ThredDemo1st implements Runnable {
    public void run(){
        while(true){
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
class ThredDemo2nd implements Runnable {
    public void run(){
        while(true){
            System.out.println("Good Afternoon");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {}
        }
    }
}
public class Lab11A2{
    public static void main(String[] args) {
        Thread obj1 = new Thread(new ThredDemo1st());

        Thread obj2 = new Thread(new ThredDemo2nd());


        obj1.start();
        obj2.start();
    }
}