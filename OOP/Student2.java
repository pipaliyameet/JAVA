public class Student2 {
    int a = 10;
    static int temp2 = 5;
    public static void main(String[] args) {
        Student2.printStar();
        System.out.println(temp2);
    }
    static void printStar(){
        printMeet();
        System.out.println("**********");
    }
    static void printMeet(){
        System.out.println("MeetPipaliya");
    }
}
