public class Construct {


    int id;

    String name;


    Construct() {
        System.out.println("Construct");
    }

    Construct(int id, String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("id : " + id);
        System.out.println("name : " + name);
    }

    public static void main(String arg[]) {
        Construct c = new Construct(1, "sara");
        c.display();
    }
}
