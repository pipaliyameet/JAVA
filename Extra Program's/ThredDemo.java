
class FirstThred extends Thread{
    public void run(){
        while(true){
            System.out.println("Hii From Thred class ");
            try{
                sleep(10);
            }catch(Exception e){}
        }
    }
} 
public class ThredDemo {
    public static void main(String[] args) {
        FirstThred obj1 = new FirstThred();
        obj1.start();
        while(true){
            System.out.println("Hii From main class ");
            try{
                obj1.sleep(10);
            }catch(Exception e){}
        }
    }
}
