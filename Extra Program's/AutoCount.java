import java.util.Scanner;
class GiveInput extends Thread{
    public static void input(){
        Scanner sc = new Scanner(System.in);

        int temp = sc.nextInt();
    }
}
public class AutoCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiveInput obj1 = new GiveInput();
        try{
            String count = "count = ";
            for(int i=101 ; i<103 ; i++){
                System.out.print(i+" is a : ");
                obj1.start();
                
                obj1.sleep(1000*2);
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
