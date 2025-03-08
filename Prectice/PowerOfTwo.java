import java.util.Scanner;
public class PowerOfTwo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entet number : ");
        int n = sc.nextInt();
        int count=0;
        for(int i=0 ; i<n ; i++){
            if((Math.pow(2,i))==n){
                System.out.println("true \n"+n+" == 2^"+i);
            }
            else{
                count++;
            }
        } 
        if(count==n){
            System.out.print("false");
        }
        sc.close();
    }
}