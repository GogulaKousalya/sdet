package JavaActivity2;
//Abstract class
abstract class Book {
    String title;
    //Abstract method
    abstract void setTitle(String s);
    
    //Concrete method
    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    //Define abstract method
    public void setTitle(String s) {
        title = s;
    }
}

public class BookS2A {
    
    public static void main(String []args) {
        //Initialize title of the book
        String title = "Stories";
        //Create object for MyBook
        Book newNovel = new MyBook();
        //Set title
        newNovel.setTitle(title);
        
        //Print result
        System.out.println("The title is: " + newNovel.getTitle());
    }
}