class Numbers extends Thread{
    public void run(){
        while (true) { 
            int num = (int)(Math.random()*10);
            if(num%2==0){
                EvenOfNumber obj1 = new EvenOfNumber(num);
            }
            else{
                CubeOfNumber obj1 = new CubeOfNumber(num);
            }
        } 
    }
}
class EvenOfNumber extends Thread{
    int num;

    public EvenOfNumber(int num) {
        this.num=num;
    }
    public void run(){
        System.out.println("Sqer = "+num*num);
    }
}
class CubeOfNumber extends Thread{
    int num;

    public CubeOfNumber(int num) {
        this.num=num;
    }
    public void run(){
        System.out.println("cube = "+num*num*num);
    }
}
public class Lab11B5 {
    public static void main(String[] args) {
        Number obj = new Number(); 
        obj.start();
    }
}
