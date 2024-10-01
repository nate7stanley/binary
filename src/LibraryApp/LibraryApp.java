/*
package LibraryApp;            // use new collections knowledge to improve this. consider fixing it first so it gets improved and not worse.


import java.util.*;
import java.util.ArrayList;

            //create program that uses all OOPS features, strings, exceptions, arrays to search for books inside an array
abstract class LibraryApp {

    abstract void search(String input);
    String title;
    String author;
    String genre;

}

    class Library extends LibraryApp {
        public Library(String title, String author, String genre) {

        }

        void search(String input) {
            // use arraylist or linkedlist
            //or create an array of book objects

            ArrayList<Book> Book = new ArrayList<>();
            Book.add(new Book("what they teach you at harvard business school", "philip delves broughton", "educational"));
            Book.add(new Book("What they don't teach you at Harvard Business School", "Mark H. Mcormack", "educational"));
            Book.add(new Book("Catch 22", "Joseph Heller", "unknown"));
            Book.add(new Book("Fahrenheit 451", "Ray Bradbury", "Horror?"));


            if (Objects.equals(input, Book)) {
                System.out.println(title + author + genre);

            } else {
                System.out.println(Book);
            }

        }

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Enter title: ");

        String input = scan.nextLine();
        Library.search(input);

        }


    }
*/
