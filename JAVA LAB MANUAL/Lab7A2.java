class Book{
    private String authorName;

    Book(String authorName){
        this.authorName=authorName;
        
    }
    String getAuthorName() {
        return authorName;
    }
    void display(){
        System.out.println("author name is = "+authorName);
    }
}
class  BookPublication extends Book{
    private String tital;
    BookPublication(String tital , String authorName){
        super(authorName);
        this.tital=tital;
        
    }
    void display(){
        System.out.println("author name is = "+getAuthorName());
        System.out.println("Book tital is = "+tital);
    }
}
class PaperPublication extends Book{
    private String tital;
    PaperPublication(String tital , String authorName){
        super(authorName);
        this.tital=tital;
        
    }
    void display(){
        System.out.println("author name is = "+getAuthorName());
        System.out.println("Paper tital is = "+tital);
    }
}
public class Lab7A2 {
    public static void main(String[] args) {

        String author = args[0];
        String tital = args[1];
        String paper = args[2];

        Book obj1;
        if(args[2].equals("book")){
            obj1 = new BookPublication(tital, author);
        }
        else if(args[2].equals("paper")){
            obj1 = new PaperPublication(tital, author);
        }
        else{
            System.out.println("invalid data");
            return ;
        }
        obj1.display();
    }
}
