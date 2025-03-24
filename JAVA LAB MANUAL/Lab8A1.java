import java.util.Scanner;
abstract class Vgetable{
    String color;
    Vgetable(String color){
        this.color=color;
    }
    public abstract String toString();
}

class Potato extends Vgetable{

    Potato(String color){
        super(color);
    }
    public String toString(){
        return super.color;
    }
}

class Brinjal extends Vgetable{
    Brinjal(String color){
        super(color);
    }
    public String toString(){
        return super.color;
    }
}

class Tomato extends Vgetable{
    Tomato(String color){
        super(color);
    }
    public String toString(){
        return super.color;
    }
} 
//  Potato, Brinjal and Tomato
public class Lab8A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a color : ");
        String color = sc.nextLine();

        Vgetable obj;
        if(color.equals("yellow")){
            obj = new Potato(color);
        }
        else if(color.equals("purple")){
            obj = new Potato(color);
        }
        else if(color.equals("red")){
            obj = new Potato(color);
        }
        else{
            return ;
        }
        System.out.println(obj.toString());
        // Potato obj1 = new Potato("color");

        // Brinjal obj2 = new Brinjal("color");

        // Tomato obj3 = new Tomato("color");

        sc.close();
    }
}



