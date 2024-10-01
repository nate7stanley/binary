package fileHandling;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Test.txt");
           writer.write("this is my second file creation");
           writer.close();
           System.out.println("File written successfully");
        }
        catch(IOException e) {
                System.out.println("Error filing file");
                e.printStackTrace();
            }

    }
}