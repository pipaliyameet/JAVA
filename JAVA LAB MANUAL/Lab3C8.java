import java.util.Scanner;
public class Lab3C8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.print("Enter a number : ");
        int m = sc.nextInt();

        int x , y ;

        if(n>m){
            x = n ;
            y = m ;
        }
        else{
            x = m ;
            y = n ;
        }

        int j = (x+1);

        while(j<y){
           int count = 0;
           for(int i=2 ; i<j ; i++)
           {
               if(j % i == 0)
               {
                   count++;
               }
            //    else{
            //        continue;
            //    }
           }
           if(count == 0)
           {
            System.out.print(j);
           }
        //    else{
            
        //    } 
           j++;
        }
    }
}
