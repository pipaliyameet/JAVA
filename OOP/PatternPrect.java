import java.util.Scanner;
class Rectengal{
    int length;
    int width;
    boolean isFilled;

    public Rectengal(){
        length = 6;
        width = 6;
        isFilled = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 if you wont costumisi rect /n Enter any other key for Defult");
        int temp = sc.nextInt();

        if(temp==1){
            setParameter();
        }
    }
    
    public void setParameter(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a length for obj1 : ");
        length = sc.nextInt();
        System.out.print("Enter a width for obj1 : ");
        width = sc.nextInt();
        System.out.print("Enter a isFilled for obj1 : ");
        int temp1isFailled = sc.nextInt();
        if(temp1isFailled==0){
            isFilled = false;
        }
        else{
            isFilled = true;
        }
    }
    public void print(){
        for(int i=0 ; i<width ; i++){
            for(int j=0 ; j<length ; j++){
                if(i==0 || j==0 || i==width-1 || j==length-1 || isFilled){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    public void changeLength(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you went to change length : ");
        int temp2 = sc.nextInt();
        length = length + (temp2);
        print();
    }
    public void changeWidth(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you went to change width : ");
        int temp2 = sc.nextInt();
        length = length + (temp2);
        print();
    }
    public void changeFilled(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter true if you filled rectangle or Enter false if you want regular rectangale  : ");
        boolean temp2 = sc.nextBoolean();
        isFilled = temp2; 
        print();
    }
}
public class PatternPrect {
    public static void main(String[] args) {

        Rectengal obj1 = new Rectengal();
        obj1.print();

        Rectengal obj2 = new Rectengal();
        obj2.print();
    }
}
