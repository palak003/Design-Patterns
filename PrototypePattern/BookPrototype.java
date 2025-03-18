package PrototypePattern;

public class BookPrototype {

   public static void main(String[] args){
   Book book1=new Book("Hello", "Palak");
   Book book2= (Book) book1.clone();

   book1.showDetails();
   book2.showDetails();

   System.out.println(book1==book2); //values same but heap location different
       //this reduces loading time of every attribute that is same for particular objects
   }
}
