package CollectonsPractice;

import java.util.*;
import java.util.stream.*;

public class StreamPractice {


    // convert list into set, filter records based on age, list of people  age 25 to 50, list of employees with salary greater then 4000. list of only names

    public static void main(String args[]) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "rank", 48, 8673));
        list.add(new Employee(2, "employee", 71, 3647));
        list.add(new Employee(3, "labourer", 71, 4376));
        list.add(new Employee(4, "file", 35, 224));
        list.add(new Employee(5, "worker", 94, 2799));
        list.add(new Employee(6, "intern", 88, 137));
        list.add(new Employee(7, "slave", 10, 9053));


        List<String> list2 = list.stream()
                .filter((Employee) -> Employee.getAge() >= 25)
                .filter((Employee) -> Employee.getAge() <= 50)
                .map(Employee->Employee.getName())
                .collect(Collectors.toList());
        System.out.println("employees between 25 and 50 years old : " + list2);

        List<String> list3 = list.stream()
                .filter((Employee) -> Employee.getSalary()> 4000)
                .map(Employee->Employee.getName())
                .collect(Collectors.toList());
        System.out.println("employees making more then 4k : " + list3);


    }
}