package PrototypePattern;

public class Book implements Prototype{
    private String bookName;
    private String author;

    public Book(String bookName,String author){
        this.bookName=bookName;
        this.author=author;
    }

    @Override
    public Prototype clone() {
        return new Book(this.bookName,this.author);
    }

    public void showDetails(){
        System.out.println("bookname: " + this.bookName + "author: "+ this.author);
    }
}
