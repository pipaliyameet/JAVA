import java.util.Scanner;

public class Lab6B3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
    
        String s;
        int totalA=0 , totalE=0 , totalI=0 , totalO=0 , totalU=0 ;

        while (true) {
            System.out.print("Enter a sentence :");
            s = sc.nextLine();

            if (s.equalsIgnoreCase("quit")) {
                break; 
            }

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == 'A' || c == 'a') {
                    totalA++;
                } else if (c == 'E' || c == 'e') {
                    totalE++;
                } else if (c == 'I' || c == 'i') {
                    totalI++;
                } else if (c == 'O' || c == 'o') {
                    totalO++;
                } else if (c == 'U' || c == 'u') {
                    totalU++;
                }
            }
        }

        System.out.println("Total count of A: " + totalA);
        System.out.println("Total count of E: " + totalE);
        System.out.println("Total count of I: " + totalI);
        System.out.println("Total count of O: " + totalO);
        System.out.println("Total count of U: " + totalU);
    }
}
