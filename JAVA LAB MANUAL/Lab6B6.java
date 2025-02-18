class Number{
    static int count = 0;
    public Number(){
        count++;
        System.out.println(count);
    }

}
public class Lab6B6{
    public static void main(String[] args) {
        Number c1 = new Number();

        Number c2 = new Number();
    }
}