package MultiThreading;

import java.util.ArrayList;

public class LambdaExample {                //look up lambda please

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(31);
        list.add(40);
        list.add(50);
        list.forEach((n) -> {
            if (n%4 == 0) System.out.println(n);
        });
    }
}

//uses functional interface for implementation
