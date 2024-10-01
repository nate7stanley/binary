package CollectonsPractice;

import java.util.*;                     //double colon references methods without needing to put arguments
import java.util.stream.Collectors;     //some of the functions in the notes on here are meant for all the same variable type, it seems.

public class StreamExample  {


    public static  void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Nate", 21, 4000));
        list.add(new Employee(2, "Preeti", 22, 7500));
        list.add(new Employee(3, "Kenneth", 23, 5000));
        list.add(new Employee(4, "Mangal", 24, 9700));
        list.add(new Employee(5, "Haida", 25, 2100));

//        list.stream()
//                .filter(Employee -> Employee.getSalary() > 5000)
//                .forEach(Employee -> System.out.println(Employee))

              List<Integer> list2= list.stream()
                 //   .flatMap(List::stream)
                 //   .map(String::toUpper(Case)
                 //   .distinct()
                 //   .sorted()
                 //   .peek(s -> IntermediateResults.add(s)
                      .filter((Employee) -> Employee.getSalary() > 2000)
                      .limit(5)
                      .map(Employee->Employee.getSalary())
                .collect(Collectors.toList());
        System.out.println(list2);
    }




    }

