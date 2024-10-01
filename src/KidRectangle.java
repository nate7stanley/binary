import java.util.*;
public class KidRectangle extends ShapeDad {


    public static void main(String[] args) {




    }
    public void Rectangle() {
        Scanner scan = new Scanner(System.in);

        System.out.println("whats the height?");
        int height = scan.nextInt();
        System.out.println("and how wide?");
        int wide = scan.nextInt();
        System.out.println("your area is : " + height * wide);
        System.out.println("your perimeter is : " + height * 2 + wide * 2);
    }

}
