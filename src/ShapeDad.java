import java.util.*;

abstract class ShapeDad {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("1. square 2. circle 3. rectangle 4. triangle");
        int shape=scan.nextInt();

        switch (shape) {
            case 1:
               System.out.println("The square is a circle");
                break;
            default:
                System.out.println("how big is the side?");
        }


    }
}
