interface Transport{
    public void deliver();
}
abstract class Animal{

}
//Tiger, Camel, Deer and Donkey

class Tiger extends Animal{

}
class Camel extends Animal implements Transport{
    public void deliver(){
        System.out.println("Hii");
    }
    
}
class Deer extends Animal{
    
}
class Donkey extends Animal implements Transport{
    public void deliver(){
        System.out.println("Byy");
    }
}

public class Lab8A3{
    public static void main(String[] args) {
        Animal[] a = new Animal[4];

        a[0] = new Tiger();
        a[1] = new Camel();
        a[2] = new Deer();
        a[3] = new Donkey();

        ((Transport)a[1]).deliver();
        ((Transport)a[3]).deliver();
    }
}