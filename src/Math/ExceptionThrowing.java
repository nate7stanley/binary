package Math;

public class ExceptionThrowing {

    public static void main(String[] args) throws NullPointerException {

        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            throw new NullPointerException("null pointer");

        } catch (NullPointerException e) {
            System.out.println(";(");               //always do specific catches first, obviously
        } catch (Exception e) {
            System.out.println(">:(");
        } finally {
            System.out.println("ok");                //finally happens whether an exception occurs or not
        }



    }
}
