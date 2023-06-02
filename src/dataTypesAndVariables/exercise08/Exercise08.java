package dataTypesAndVariables.exercise08;

public class Exercise08 {
    public static double averageAge(Person[] people) {
        int numberOfPeople = people.length;
        int sumOfAges = 0;

        for (Person person : people) {
            sumOfAges += person.age;
        }

        return (double) sumOfAges / numberOfPeople;
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "Marcelo";
        p1.age = 23;
        p2.name = "Ryandra";
        p2.age = 24;

        Person[] people = {p1, p2};
        double averageAge = averageAge(people);

        System.out.printf("The average of the ages is %f", averageAge);
    }

}
