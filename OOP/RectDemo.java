import java.util.Scanner;
public class RectDemo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Rectengal opj1 = new Rectengal();
        opj1.print();

        int temp = 1;

        while (temp==1){

            System.out.println("Enter 1 for length");
            System.out.println("Enter 2 for width");
            System.out.println("Enter 3 for filde");
            int change = sc.nextInt();
            if(change==1){
                opj1.changeLength();
            }
            else if(change==1){
                opj1.changeWidth();
            }
            else if(change==3){
                opj1.changeFilled();
            }

            System.out.print("Enter 1 if you want to continue : ");
            temp = sc.nextInt();
        }
    }
}
