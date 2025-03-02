import java.util.Scanner;

public class StudentMarkArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter total student number : ");
        int n = sc.nextInt();
        
        int[] s = new int[n];
        int[] temp = new int[10];
        for(int i=0 ; i<s.length ; i++){
            System.out.print("Enter a mark student number"+(i+1)+" : ");
            s[i] = sc.nextInt();
            if(s[i] >= 35){
                // System.out.println("student number "+(i+1)+" is pass");
            }
            else{
                    
                // System.out.println("student number "+(i+1)+" is fail");
            }
            count++;
        }

        // int mainCount = 1;
        // for(int i=0 ; i<s.length ; i++){
        //     if(s[i] >= 35){
        //         System.out.println("student number "+mainCount+" is pass");
        //     }
        //     else{
        //         System.out.println("student number "+mainCount+" is fail");
        //     }
        //     mainCount++;
        // }
        sc.close();
    }
}
