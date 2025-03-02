public class TestStaticBlock {
    static int a;
    
    static{                        
        a = 10;
        System.out.println("From the static block");
        /* static Block
           it well be execute even before the main method */
    }

    public static void main(String[] args) {
        System.out.println("From the main block");
    }
    static void printMe(){

    }
}
