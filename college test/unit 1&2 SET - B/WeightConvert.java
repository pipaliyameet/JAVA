import java.util.Scanner;
class Rice{
    double weight;

    Rice(double weight){
        Scanner sc = new Scanner(System.in);
        this.weight = weight;
        System.out.print("If you get weigth in kg so pls enter 0 or if you get weigth in gram so pls enter 1 : ");
        int temp = sc.nextInt();
        if(temp==0){
            addKg();
        }
        if(temp==1){
            addGrams();
        }
    }

    void addKg(){
        System.out.println("Your entrd weight is = "+this.weight+" Kg");
    }

    void addGrams(){
        double weightingram = (weight*1000);
        System.out.println("Your entrd weight is = "+weightingram+" Gram");
    }
}
public class WeightConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a weigth of Rice in killo-Gram: ");
        double weigth = sc.nextDouble();

        Rice obj1 = new Rice(weigth);
    }
}
