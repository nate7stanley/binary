package CollectonsPractice;
import java.util.*;
public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Preeti", 4, 3000));

        list.add(new Employee(2, "Nate", 5, 2500));

        list.add(new Employee(3, "Mangal", 6, 3500));

        Collections.sort(list, new compareBySalary());

        for (int i=0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }




    }


}

class compareById implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getId() - o2.getId();
    }
}

class compareByName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
        }
    }

    class compareBySalary implements Comparator<Employee> {


        @Override
        public int compare(Employee o1, Employee o2) {
            return o2.getSalary() - o1.getSalary();
        }
    }

