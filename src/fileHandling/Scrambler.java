
package fileHandling;

import java.io.*;
import java.util.ArrayList;

public class Scrambler {


    public static void main(String[] args) {
        ArrayList<Scroll> list=new ArrayList<>();
        list.add(new Scroll("what they teach you at Harvard business school", "phillip", "education"));
        list.add(new Scroll("What they don't teach you at Harvard business school", "Mark", "education"));
        list.add(new Scroll("Catch 22", "Joseph", "unknown"));

        try{
            FileOutputStream fs = new FileOutputStream("test2.txt");        //character input/output stream also exist, and array
            ObjectOutputStream objStream= new ObjectOutputStream(fs);
            objStream.writeObject(list);

            objStream.close();
            fs.close();

            System.out.println("Success");




            FileInputStream fi = new FileInputStream("test2.txt");

            ObjectInputStream fo = new ObjectInputStream(fi);

            ArrayList<String> l=(ArrayList)fo.readObject();
            System.out.println(l);

            fi.close();
            fo.close();

            } catch(IOException e) {
                System.out.println(e);}

         catch (ClassNotFoundException g) {
            System.out.println(g);
        }
    }
}

class Scroll extends Scrambler{


    String title;
    String author;
    String genre;

    public Scroll(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
}

