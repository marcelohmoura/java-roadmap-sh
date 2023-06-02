package dataTypesAndVariables;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class exercise09 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Type a number, and press Enter. Or Type 0 to finish.");
            number = scanner.nextInt();
            numbers.add(number);
        } while (number != 0);
        numbers.sort(Comparator.naturalOrder());

        System.out.println(numbers);
    }
}
