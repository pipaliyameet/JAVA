import java.util.Scanner;

public class StudentMarkArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        System.out.print("Enter total student number : ");
        int n = sc.nextInt();

        
        int[] s = new int[n];
        for(int i=0 ; i<s.length ; i++){
            System.out.print("Enter a mark student number"+count+" : ");
            s[i] = sc.nextInt();
            count++;
        }
        int mainCount = 1;
        for(int i=0 ; i<s.length ; i++){
            if(s[i] >= 35){
                System.out.println("student number "+mainCount+" is pass");
            }
            else{
                System.out.println("student number "+mainCount+" is fail");
            }
            mainCount++;
        }
        sc.close();
    }
}
