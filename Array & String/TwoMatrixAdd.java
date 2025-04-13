import java.util.Scanner;
public class TwoMatrixAdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];

        System.out.println("~ Enter matrix a element ~");
        System.out.println("");
        for (int i = 0; i < a.length ; i++) {
            for(int j =0 ; j<a.length ; j++){
                System.out.print("Enter element a["+i+"]["+j+"] : ");
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("~ Enter matrix b element ~");
        System.out.println("");
        for (int i = 0; i < b.length ; i++) {
            for(int j =0 ; j<b.length ; j++){
                System.out.print("Enter element b["+i+"]["+j+"] : ");
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("~ sum matrix  matrix c element is ~");
        System.out.println("");
        for (int i = 0; i < c.length ; i++) {
            for(int j =0 ; j<c.length ; j++){
                System.out.print("Enter element c["+i+"]["+j+"] : ");
                c[i][j] = (a[i][j]+b[i][j]);
                System.out.println(c[i][j]);
            }
        }
    }
}
