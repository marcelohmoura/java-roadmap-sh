package dataTypesAndVariables;
import java.util.Scanner;
import java.text.DecimalFormat;
public class exercise04 {
    public static void main(String[] args) {
        double weight, height, bodyMassIndex;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the Weight, and press Enter:");
        weight = scanner.nextDouble();
        System.out.println("Type your height, and press Enter:");
        height = scanner.nextDouble();

        bodyMassIndex = weight / (height * height);

        System.out.printf("The value of the Body Mass Index is: %s",
                new DecimalFormat("#.##").format(bodyMassIndex));
    }
}
