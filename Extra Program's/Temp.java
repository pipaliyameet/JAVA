import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Temp extends Thread {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Scanner scanner = new Scanner(System.in);
        
        try{
            String count = "count = ";
            for(int i=101 ; i<=103 ; i++){
                int x=0;
                
                System.out.print((i)+" Is a : ");
        
                Future<String> future = executor.submit(() -> {
                    return scanner.nextLine();
                });

                try {
                    String input = future.get(2, TimeUnit.SECONDS);
                    
                    x = Integer.parseInt(input);
            
                } catch (Exception e) {}
                if(x==1){
                    continue;
                }
                else{
                    System.out.println(x);

                    String s = Integer.toString(i)+ ", ";
                    count = count.concat(s);
                }
                System.out.println("");
            }
            System.out.println(count);
        }catch(Exception e){}
    }
}
