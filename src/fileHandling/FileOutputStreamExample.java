package fileHandling;


import java.io.*;
import java.util.ArrayList;

public class FileOutputStreamExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Preeti");
        list.add("Mangal");
        list.add("Haida");
        list.add("Kenneth");
        list.add("Nate");

        try{
            FileOutputStream fs = new FileOutputStream("test2.txt");
            ObjectOutputStream objStream= new ObjectOutputStream(fs);
            objStream.writeObject(list);

            objStream.close();
            fs.close();

            System.out.println("Success");

            FileInputStream fi = new FileInputStream("test2.txt");

            ObjectInputStream objInputStream = new ObjectInputStream(fi);

            ArrayList<String> l=(ArrayList)objInputStream.readObject();
            System.out.println(l);


        } catch(IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException g) {
            System.out.println(g);
        }
    }


}
