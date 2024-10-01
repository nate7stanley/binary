import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        //declare the array
    int arr[];

        System.out.println("input 6 different numbers. press enter after each.");
   arr=new int[6];
        //set the array to 6 numbers and ask for 6 inputs use a loop, store the number given, step 3 profit i guess
        arr[0]=scan.nextInt();
        arr[1]=scan.nextInt();
        arr[2]=scan.nextInt();
        arr[3]=scan.nextInt();
        arr[4]=scan.nextInt();
        arr[5]=scan.nextInt();

        //reversed "for" loop subtracts from i instead of adds, starts at 5 (index is 0-5)
    for(int i=5;i>=0;i--) {
        System.out.println(arr[i]);
    }

    }
}
// reverse a number