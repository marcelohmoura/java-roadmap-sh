package dataStructuresAndCollectionFrameworks.exercise02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Marcelo");
        s1.setAge(23);
        Student s2 = new Student();
        s2.setName("Paulo");
        s2.setAge(45);

        Student s3 = new Student();
        s3.setName("Ryandra");
        s3.setAge(24);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                String ageStudent1 = Integer.toString(s1.getAge());
                String ageStudent2 = Integer.toString(s2.getAge());
                return ageStudent1.compareTo(ageStudent2);
            }
        });

        for (Student student: students) {
            System.out.printf("Name: %s \n", student.getName());
            System.out.printf("Age: %d \n \n", student.getAge());
        }
    }
}
