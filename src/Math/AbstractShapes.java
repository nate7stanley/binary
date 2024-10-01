package Math;
import java.util.*;

abstract class AbstractShapes {
    abstract void PrintArea();
}

class Triangle extends AbstractShapes {
    void PrintArea() {
        Scanner scan = new Scanner(System.in);

        String shape= "triangle";
        int base=scan.nextInt();
        int height=scan.nextInt();

        System.out.println("area of "+ shape);
        System.out.println(0.5*height*base);



    }
}

class ShapeInput {
    public static void main(String[] args) {
        AbstractShapes s= new Triangle();
        s.PrintArea();
    }

}

