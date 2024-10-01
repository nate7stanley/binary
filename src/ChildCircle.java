import java.util.*;
public class ChildCircle extends ShapeDad {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how big is the radius?");
        int height = scan.nextInt();
        System.out.println("perimiter is : " + height * 2 * Math.PI);
        System.out.println("area is : " + height * height * Math.PI);


    }
}



