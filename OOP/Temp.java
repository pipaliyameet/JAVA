class Abc{
    String name = "Meet";
    public void printName(String name){
        this.name = "Pipaliya";
        System.out.println("Name in the function = "+this.name);
    }
    public void something(){
        System.out.println("Name in the something = "+name);
    }
}

public class Temp{
    public static void main(String[] args){
        Abc a = new Abc();
        a.printName("Meet");
        a.something();
    }
}

