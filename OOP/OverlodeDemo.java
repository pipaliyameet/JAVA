// class Overlode{
//     int n1;
//     int n2;
//     int n3;

//     int add(int n1 , int n2){
//         System.out.println("int add");
//         return n1+n2;
//     }

//     double add(double n1 , int n2){
//         System.out.println("double int add");
//         return n1+n2;
//     }

//     double add(double n1 , double n2){
//         System.out.println("double add");
//         return n1+n2;
//     }
    // int add(){
    //     return 0;
    // }

    // int add(int n1 , int n2){
    //     return n1+n2;
    // }

    // int add(int n1 , int n2 , int n3){
    //     return n1+n2+n3;
    // }
// }

public class OverlodeDemo {
    public static void main(String[] args) {
        OverlodeDemo o1 = new OverlodeDemo();

        System.out.println(o1.add(5.1,5));

        // o1.n1 = 5;
        // o1.n2 = 5;
        // o1.n3 = 5;
        // System.out.println(o1.add(5,5,5));
        // System.out.println(o1.add(5,5));
        // System.out.println(o1.add());
    }

    int n1;
    int n2;
    int n3;
    
    int add(int n1 , int n2){
        System.out.println("int add");
        return n1+n2;
    }
    
    double add(double n1 , int n2){
        System.out.println("double int add");
        return n1+n2;
    }
    
    double add(double n1 , double n2){
        System.out.println("double add");
        return n1+n2;
    }
}
