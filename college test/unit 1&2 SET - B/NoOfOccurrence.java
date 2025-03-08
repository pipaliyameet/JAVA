import java.util.Scanner;
public class NoOfOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String s = sc.nextLine();
        
        for(int i=0 ; i<s.length() ; i++){
            int count = 0;
            int temp=0;
            for(int j=0 ; j<s.length();j++){
                for(int k=0 ; k<i ; k++){
                    if(s.charAt(i)==s.charAt(k)){
                        temp=85757;
                        break;
                    }
                }
                if(temp==0){
                    if(s.charAt(i)==s.charAt(j)){
                        count++;
                    }
                }
            }
            if(temp==0){
                System.out.print(s.charAt(i)+" = "+count+"\t");
            }
        }
        sc.close();
    }
}
