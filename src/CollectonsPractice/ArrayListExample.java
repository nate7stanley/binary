/*package CollectonsPractice;



import java.util.ArrayList;                     //use linkedlist. data is on an index, so removing one means you have to move all the other datas over.
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList();       //String in this line is Generics (integer instead of int). only needed at one place but works on both
        list.add(new Book( "java programming", "Preeti", "learning"));
        list.add(new Book( "spring framework", "haida", "learning"));
        list.add(new Book( "python", "nate", "learning"));
        list.add(new Book( "c++", "mangal", "learning"));
        list.add(new Book( "html", "ruth", "learning"));

        System.out.println(list);

        /*System.out.println("now im gonna sort them");
        Collections.sort(list);

        Iterator itr = list.iterator();
        while(itr.hasNext());
        Book s=(Book)itr.next();
        System.out.println(itr.next());


        }
     //   ArrayList<String> list2 = new ArrayList<String>();

//        list2.addAll(list);
//        list2.add("Kenneth");


    }

*/