package CollectonsPractice;
import java.io.*;

public class ObjectSerializable {

    public static void main(String[] args) {


        Book book = new Book(101, "fava programing", "JP", 25.05);

        try (FileOutputStream fileOut = new FileOutputStream("test2.txt");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(book);
            System.out.println("Object written to file");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileIn = new FileInputStream("Book.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            System.out.println("Object read from file");
            System.out.println(book);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
