package CollectonsPractice;

public class Employee extends ComparatorExample {

     int id;
     String name;
     int salary;
     int age;

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }




    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
         return age;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
    }
}
