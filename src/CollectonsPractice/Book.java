package CollectonsPractice;

import java.io.Serializable;

import java.util.Objects;

public class Book implements Serializable{

    /*
    @Override
    public int compareTo(Book o) {                          //under comparable
        if(Objects.equals(input, o.title) ) return Book;                    //this goes under book, currently no valid variables to use this
        else return 10;
    }
    */

    private static final long serialVersionUID = 1L;

    private int bookId;

    private String author;

    private String title;

    private double price;

    public Book(int bookId, String author, String title, double price) {

        this.bookId = bookId;
        this.author = author;
        this.title = title;
    }

    public int getBookTitle() {
        return bookId;
    }

    public void setBookTitle(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public String setTitle(String title) {
        this.title = title;
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.author = author;
    }

    public String title() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }



    }

