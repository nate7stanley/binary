import java.util.*;
public class ChildTriangle extends ShapeDad {


public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("whats the height?");
    int height = scan.nextInt();
    System.out.println("and how wide?");
    int wide = scan.nextInt();
    System.out.println("please input first side");
    int side1 = scan.nextInt();
    System.out.println("second side");
    int side2 = scan.nextInt();
    System.out.println("third side");
    int side3 = scan.nextInt();
    System.out.println("your area is : " + height * wide * 0.5);
    System.out.println("your perimeter is : " + side1 + side2 + side3);
}
    }
