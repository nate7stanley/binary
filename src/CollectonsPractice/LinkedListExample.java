/*package CollectonsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;             //no index, each data points to the next data. removing one is easier this way. it links the elements.
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Book> list = new LinkedList();       //String in this line is Generics. only needed at one place but works on both
        list.add(new Book(1, "java programming", "Preeti", 50));
        list.add(new Book(2, "spring framework", "haida", 50));
        list.add(new Book(3, "python", "nate", 50));
        list.add(new Book(4, "c++", "mangal", 50));
        list.add(new Book(5, "html", "ruth", 50));


        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Book b = (Book) itr.next();
            System.out.println(b.getTitle());
        }

    }
}
*/