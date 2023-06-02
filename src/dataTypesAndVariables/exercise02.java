package dataTypesAndVariables;
import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        String name, city;
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your name, and press Enter:");
        name = scanner.next();
        System.out.println("Type your age, and press Enter: ");
        age = scanner.nextInt();
        System.out.println("Type your city, and press Enter: ");
        city = scanner.next();

        System.out.printf("Hi, %s. You are %d years old, and live in %s", name, age, city);
    }
}
