public class Overloading {

        // polymorphism. when compiled, the statements find out which functions they have variables for and use them.
        public int sum (int x, int y)    {

        return x + y;
    }

        public int sum(int x, int y, int z){
            return x + y + z;
    }

    public String sum(String x, String y) {
            return x+y;
    }

        public static void main(String arg[]) {

            Overloading ol = new Overloading();
            System.out.println(ol.sum(10, 20));
            System.out.println(ol.sum(10, 20, 30));
            System.out.println(ol.sum("10.3", "20.8"));
        }






}
