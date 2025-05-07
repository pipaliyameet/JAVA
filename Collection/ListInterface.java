import java.util.*;
public class ListInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> s1 = new ArrayList<String>();
        s1.add("Meet");
        s1.add("Pipaliya");
        // s1.addAll("Meet", "PipaLiya");
        System.out.println("ArrayList elements : ");
        System.out.println("\t"+s1);

        List<String> s2 = new LinkedList<String>();
        s2.add("Meet");
        s2.add("Pipaliya");
        System.out.println("");
        System.out.println("LinkedList elements : ");
        System.out.println("\t"+s2);
    }

}
