package Math;

abstract class AbstractClass {

    abstract void printInfo();

}

class Employee extends AbstractClass {

    void printInfo() {
        String name = "Avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }

}

class Base {
    public static void main(String[] args) {        //create an abstract class with a function
        AbstractClass s = new Employee();
        s.printInfo();
    }
}