import java.util.*;
public class DemoFirst {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        List<String> a = new ArrayList<String>();

        int i=0;

        while(true){
            System.out.println("Enter exit to Exit the loop or type name");

            String temp = sc.nextLine();
            if(temp.equals("Exit")){
                break;
            }
            a.add(temp);
            i++;
        }
        System.out.println(a.contains("Meet"));
        System.out.println(a.containsAll(a));
        System.out.println("Input is = "+a);
        System.out.println("Thank you");
    }
}
