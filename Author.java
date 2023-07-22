package hm.questions;

public class Author {
    String author;
    String email;

    public String getName() {
        return author;
    }

    public String setName(String name) {
        this.author = name;
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        this.email = email;
        return email;
    }

    public Author(String author, String email) {
        this.author = author;
        this.email = email;
    }

    public static void main(String args[])
    {
        Author author1= new Author("Mohan Khati","mohankc596@gmail.com");
        author1.setName("Mohan  Khati");

    }


}
