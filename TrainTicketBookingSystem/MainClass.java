import java.util.Scanner;

class User{

    String userId;
    String userName;
    String userEmailId;
    String phoneNumber;
    String password;

    public User() {
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("if you resister so enter 1 or if you login so enter 2 or if you updet profile so enter 3 or if you Book tickt so enter 4 ");
            int temp = sc.nextInt();

            if(temp==1){
                resister();
            }
            else if(temp==2){
                login();
            }
            else if(temp==3){
                updatProfile();
            }
            else if(temp==4){
                viweBooking();
            }
            else{
                break;
            }
        }
    }

    
    static int[] distance = {0,15,30,70,120};

    public void resister(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter user Name : ");
        this.userName = sc.nextLine();
        System.out.print("Enter user phone numer : ");
        this.phoneNumber = sc.nextLine();
    }

    public void login(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter user id : ");
        this.userId = sc.nextLine();
        System.out.print("Enter user email id : ");
        this.userEmailId = sc.nextLine();
        System.out.print("Enter user password : ");
        this.password = sc.nextLine();

    }

    public void logOut(){
        
    }

    public void updatProfile(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter update password : ");
        this.password = sc.nextLine();
    }

    public void viweBooking(){ 
        Scanner sc = new Scanner(System.in);

        System.out.println("~ our tain is avilable this city ~ ");
        System.out.println("st.no station");
        System.out.println("  1.   Jetup");
        System.out.println("  2.   Virpur");
        System.out.println("  3.   Gondel");
        System.out.println("  4.   Rajkot");
        System.out.println("  5.   Chotila");

        System.out.println("Enter starting point station no : ");
        int startPoint = sc.nextInt();
        System.out.println("Enter fainal point station no : ");
        int endPoint = sc.nextInt();
        if(startPoint<=5 && startPoint>0 && endPoint<=5 && endPoint>0){
            System.out.println("1st class price is = "+Math.abs((distance[startPoint-1]-distance[endPoint-1])*3));
            System.out.println("2nd class price is = "+Math.abs((distance[startPoint-1]-distance[endPoint-1])*2));
            System.out.println("3rd class price is = "+Math.abs((distance[startPoint-1]-distance[endPoint-1])*1));
        }

        System.out.println("if you prefer 1st class so enter 1 or 2nd class so enter 2 or 3rd class so enter 3 : ");
        int temp = sc.nextInt();
        System.out.println("if you gate more informetion about tarin so enter 1 : ");
        temp = sc.nextInt();
        if(temp==1){
            Train obj = new Train();
        }
    }
}

class Train{

    String trainID;
    String trainName;
    String trainType;
    int[] seats;
    int schedule;

    public Train() {
        Scanner sc = new Scanner(System.in);
        System.out.println("if you chack avilable sheet so enter 1 : ");
        int temp = sc.nextInt();
        if (temp==1){
            TrainInfo();
        }
    }

    public void TrainInfo(){
        System.out.println("Avilable sheet is = "+((int)(Math.random()*100)));
    }
}
public class MainClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        User u1 = new User();

        // User[] a = new User[100];
        // int i=0;
        // while(true){
        //     System.out.println("if you booking ticket so enter 1 or you chack your dtail so enter any other key  :");
        //     int temp = sc.nextInt(); 
        //     if(temp==1){
        //         a[i] = new User();
        //         i++;
        //     }
        //     else{

        //     }
        // }
    }
}
