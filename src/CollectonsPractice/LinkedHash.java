package CollectonsPractice;
import java.util.*;


//also need to look up how this works

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hash= new LinkedHashMap<>();
        hash.put(1, "nate");
        hash.put(2, "mangal");              //will list your things in order that you add them
        hash.put(3, "hyda");



        System.out.println(hash);
    }
}
