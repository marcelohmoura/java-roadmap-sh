package dataStructuresAndCollectionFrameworks.exercice01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setNome("Marcelo");

        Employee e2 = new Employee();
        e2.setNome("Gabriel");

        Employee e3 = new Employee();
        e3.setNome("Ryandra");

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        for (Employee employee : employees) {
            String name = employee.getName();
            System.out.printf("Name: %s \n", name);
        }
    }
}
