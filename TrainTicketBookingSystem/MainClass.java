import java.util.*;

class User{

    String userId;
    String userName;
    String userEmailId;
    String phoneNumber;
    String password;
    public int startPoint;
    public int endPoint;

    protected void temp() {
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("if you resister so enter 1 or if you login so enter 2 or if you updet profile so enter 3 or if you Book tickt so enter 4 ");
            int temp = sc.nextInt();

            if(temp==1){
                resister();
                break;
            }
            else if(temp==2){
                login();
                break;
            }
            else if(temp==3){
                updatProfile();
                break;
            }
            else if(temp==4){
                viweBooking();
                break;
            }
            else{
                break;
            }
        }
    }

    static int[] distance = {0,15,30,70,280};

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
        System.out.println("  5.   Ahemdabad");

        System.out.println("Enter starting point station no : ");
        this.startPoint = sc.nextInt();
        System.out.println("Enter fainal point station no : ");
        this.endPoint = sc.nextInt();
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
            obj.getSchedule(startPoint,endPoint);
        }
    }
}

class Train extends User{

    int[] trainID = {19120,19218,22958,11463};
    String[] trainName = {"smnh_Adi_Exp","Surashtra_Janta","Somnath_Express","Smnh_Jbp_Exp"};
    int schedule;
    int time = 9;
    int sp;
    int ep;
    int train_no;
    String train_name;
    String Time;

    public void getSchedule(int sp , int ep) {
        this.sp=sp;
        this.ep=ep;
        Scanner sc = new Scanner(System.in);

        if(sp==1&& ep>1){
            System.out.println("tain no "+trainID[0]+" , train name is "+trainName[0]+" and time is "+time+" hour");
            System.out.println("tain no "+trainID[1]+" , train name is "+trainName[1]+" and time is "+(time+2)+" hour");
            System.out.println("tain no "+trainID[2]+" , train name is "+trainName[2]+" and time is "+(time+4)+" hour");
            System.out.println("tain no "+trainID[3]+" , train name is "+trainName[3]+" and time is "+(time+6)+" hour");
        }
        else if(sp==2 && ep>2){
            System.out.println("tain no "+trainID[0]+" , train name is "+trainName[0]+" and time is "+(time)+":15 hour");
            System.out.println("tain no "+trainID[1]+" , train name is "+trainName[1]+" and time is "+(time+2)+":15 hour");
            System.out.println("tain no "+trainID[2]+" , train name is "+trainName[2]+" and time is "+(time+4)+":15 hour");
            System.out.println("tain no "+trainID[3]+" , train name is "+trainName[3]+" and time is "+(time+6)+":15 hour");
        }
        else if(sp==3 && ep>3){
            System.out.println("tain no "+trainID[0]+" , train name is "+trainName[0]+" and time is "+(time)+":40 hour");
            System.out.println("tain no "+trainID[1]+" , train name is "+trainName[1]+" and time is "+(time+2)+":40 hour");
            System.out.println("tain no "+trainID[2]+" , train name is "+trainName[2]+" and time is "+(time+4)+":40 hour");
            System.out.println("tain no "+trainID[3]+" , train name is "+trainName[3]+" and time is "+(time+6)+":40 hour");
        }
        else if(sp==4 && ep>4){
            System.out.println("tain no "+trainID[0]+" , train name is "+trainName[0]+" and time is "+(time+1)+" hour");
            System.out.println("tain no "+trainID[1]+" , train name is "+trainName[1]+" and time is "+(time+2+1)+":15 hour");
            System.out.println("tain no "+trainID[2]+" , train name is "+trainName[2]+" and time is "+(time+4+1)+":15 hour");
            System.out.println("tain no "+trainID[3]+" , train name is "+trainName[3]+" and time is "+(time+6+1)+":15 hour");
        }
        else if(sp==2 && ep<2){
            System.out.println("tain no "+trainID[0]+" , train name is "+trainName[0]+" and time is "+(time+3)+":30 hour");
            System.out.println("tain no "+trainID[1]+" , train name is "+trainName[1]+" and time is "+(time+2+3)+":30 hour");
            System.out.println("tain no "+trainID[2]+" , train name is "+trainName[2]+" and time is "+(time+4+3)+":30 hour");
            System.out.println("tain no "+trainID[3]+" , train name is "+trainName[3]+" and time is "+(time+6+3)+":30 hour");
        }
        else if(sp==3 && ep<3){
            System.out.println("tain no "+trainID[0]+" , train name is "+trainName[0]+" and time is "+(time+3)+":10 hour");
            System.out.println("tain no "+trainID[1]+" , train name is "+trainName[1]+" and time is "+(time+2+3)+":10 hour");
            System.out.println("tain no "+trainID[2]+" , train name is "+trainName[2]+" and time is "+(time+4+3)+":10 hour");
            System.out.println("tain no "+trainID[3]+" , train name is "+trainName[3]+" and time is "+(time+6+3)+":10 hour");
        }
        else if(sp==4 && ep<4){
            System.out.println("tain no "+trainID[0]+" , train name is "+trainName[0]+" and time is "+(time+2)+":30 hour");
            System.out.println("tain no "+trainID[1]+" , train name is "+trainName[1]+" and time is "+(time+2+2)+":30 hour");
            System.out.println("tain no "+trainID[2]+" , train name is "+trainName[2]+" and time is "+(time+4+2)+":30 hour");
            System.out.println("tain no "+trainID[3]+" , train name is "+trainName[3]+" and time is "+(time+6+2)+":30 hour");
        }
        else if(sp==5&&ep<5){
            System.out.println("tain no "+trainID[0]+" , train name is "+trainName[0]+" and time is "+(time)+" hour");
            System.out.println("tain no "+trainID[1]+" , train name is "+trainName[1]+" and time is "+(time+2)+":15 hour");
            System.out.println("tain no "+trainID[2]+" , train name is "+trainName[2]+" and time is "+(time+4)+":15 hour");
            System.out.println("tain no "+trainID[3]+" , train name is "+trainName[3]+" and time is "+(time+6)+":15 hour");
        }

        System.out.println("Enter train no ");
        this.train_no = sc.nextInt();

        System.out.println("Enter train name ");
        this.train_name = sc.nextLine();

        System.out.println("Enter time");
        this.Time = sc.nextLine();

        System.out.println("if you check avilable sheet so enter 1");
        int temp = sc.nextInt();

        if (temp==1){
            Seat o1 = new Seat();
        }
    }
}

class Seat extends Train{
    String seat_no = "[ " ;
    String class_type;
    int BookedSeat;
    int cancel;
    int Avilable;

    public void bookSeat(){
        Scanner sc = new Scanner(System.in);

        this.Avilable = ((int)(Math.random()*100));

        System.out.println("Avilable sheet is = "+Avilable);

        System.out.println("How many seat you are booking ");
        this.BookedSeat = sc.nextInt();

        if(Avilable>BookedSeat){
            System.out.println("Your Seat is Succesfully Bookd");

            System.out.print("Your Seat no. is = ");

            for(int i=0 ; i<BookedSeat ; i++){
                int no = ((int)(Math.random()*10000));
                System.out.print(no);

                seat_no = seat_no + Integer.toString(no);
            }
            seat_no = seat_no + " ]";
        }
        
        System.out.println("If you cancel seat so enter 0");
        cancel = sc.nextInt();

        if(cancel == 0){
            cancelSeat();
        }
    }

    public void cancelSeat(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of cancel seat ");
        int temp = sc.nextInt();

        if(BookedSeat>temp){
            BookedSeat -= temp ;
        }

        else{
            System.out.println("Somewere you mistek");
        }

        System.out.println("If you checj Availeble seat so enter 1");
        temp = sc.nextInt();

        if(temp == 1){
            checkAvailability();
        }
    }

    public void checkAvailability(){
        System.out.println("Avaibal seat is = "+(Avilable-BookedSeat));
    }
}

class Booking extends Seat{
   
    String bookingId;

    public void createBooking(){
        int temp =(int)(Math.random()*10000);
        this.bookingId = bookingId + Integer.toString(temp);
        System.out.println("Your booking id is = "+bookingId);
    }

    public void viewBookingDetails(){

        Date d1=new Date();

        System.out.println("Your(user) id is = "+super.userId);
        System.out.println("Your(user) name is = "+super.userName);
        System.out.println("your train number is = "+super.train_no);
        System.out.println("train name is = "+super.train_name);
        System.out.println("train time is = "+super.Time);
        System.out.println("Your seat no is = "+super.seat_no);
        System.out.println("your Booking id is = "+bookingId);
        System.out.println("Your trawel date is = "+d1);
    }
}

class Peyment extends Booking{


}
public class MainClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        User u1 = new User();
        u1.temp();

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
