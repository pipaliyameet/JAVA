class CheckKeyword{
    static int count1 = 0;
    int count2 = 20;
    public CheckKeyword(){
        this.count1++;
        System.out.println(count1);
        this.count2++;
        System.out.println(count2);
    }
}
public class Lab6C7 {
    public static void main(String[] args) {
        CheckKeyword n1 = new CheckKeyword();
    }
}
