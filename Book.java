package hm.questions;

public class Book{

    String isbn;
    String bookname;
//    static Author author;
    double price;
    int quantity;

    Author author=new Author("Mohan Khati","mohan596@gmail.com");

//    public Book(String author, String email, String isbn, String bookname, double price, int quantity ) {
//        super(author, email);
//        this.isbn=isbn;
//        this.bookname=bookname;
//        this.price=price;
//        this.quantity=quantity;
//    }

//    @Override
//    public String getName() {
//        return super.getName();
//    }
//
//    @Override
//    public void setName(String name) {
//        super.setName(name);
//    }
//
//    @Override
//    public String getEmail() {
//        return super.getEmail();
//    }
//
//    @Override
//    public void setEmail(String email) {
//        super.setEmail(email);
//    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public Author setAuthor(Author author) {
        this.author = author;
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void details()
    {
        Double Total_price= price*quantity;
        System.out.println("Author name: "+author.getName()+"\n"+"Email address: " +author.getEmail()+"\n"+"ISBN: "+isbn+ "\n" + "Book name: "+ bookname+ "\n"+ "Total Price: "+ Total_price );
    }

    public static void main(String args[])
    {
        Book book= new Book();

        book.setIsbn("1234567890123");
        book.setPrice(750);
        book.setQuantity(2);

        book.details();


    }
}
