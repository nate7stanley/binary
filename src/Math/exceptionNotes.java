package Math;

//exceptions are things your program can handle, errors are not.
//checked exceptions  happen at compile time, unchecked exceptions happen at runtime.
//built in exceptions include checked and unchecked
//checked exceptions : ClassNotFound, Interrupted, IO, Instantiation, sql, FileNotFound
//unchecked exceptions: Arithmetic, ClassCast, NullPointer, ArrayIndexOutOfBounds, ArrayStore, IllegalThreadState
//user defined exceptions: try {} catch {} finally {}

public class exceptionNotes {
    public static void main(String[] args) {

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("something went wrong");
        } finally {
            System.out.println("the 'try catch' is final");
        }
    }
}

//
