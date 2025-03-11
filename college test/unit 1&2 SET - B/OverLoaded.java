class Point{
    int x=5;
    int y=8;
    Point(){
        System.out.println("Defolt ~> x="+x+" and y="+y);
    }
    Point(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println("Perametaerized ~> x="+this.x+" and y="+this.y);
    }
}
public class OverLoaded {
    public static void main(String[] args) {
        Point obj1 = new Point(1,2);
    }
}

