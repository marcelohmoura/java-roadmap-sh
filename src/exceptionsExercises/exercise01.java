package exceptionsExercises;
import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type the first number, and press Enter:");
        int n1 = input.nextInt();
        System.out.println("Type the second number, and press Enter:");
        int n2 = input.nextInt();

        try {
            int result = n1 / n2;
            System.out.printf("%d / %d = %d", n1, n2, result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }

    }
}
