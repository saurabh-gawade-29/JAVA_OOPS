package Homework.problem11;

/*
Create two classes Author and Book.
A book has one author (as an object of the Author class).
Display book details along with author details.
 */
class Author {
    String name;
    String nationality;
    // Constructor: special method
    public Author(String aname, String anationality){
        this.name = aname;
        this.nationality = anationality;
    }
}

class Book {
    String title;
    double price;
    Author author; // this is my object
    // Book Author
    public Book(String btitle, double bprice, Author bauthor){
        this.title = btitle;
        this.price = bprice;
        this.author = bauthor;
    }

    public void display(){
        System.out.println(title + " "  + price + " " + author.name);
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Author author = new Author("Chetan Bhagat", "Indian");
        Book book = new Book("2 states", 299.00, author); // object
        book.display();
    }
}
