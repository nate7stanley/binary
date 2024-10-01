public class Child extends Overriding {
    public void child() {
        System.out.println("the child");
    }
        public static void main(String arg[]) {
            Overriding p =new Overriding();
            p.test();
            Overriding p2= new Child();
            p2.test();

        }
    }

