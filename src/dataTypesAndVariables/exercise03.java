package dataTypesAndVariables;
import java.util.Scanner;
import java.text.DecimalFormat;
public class exercise03 {
    public static void main(String[] args) {
        double base, height;
        String area, perimeter;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the value of the base of the rectangle, and press Enter:");
        base = scanner.nextDouble();
        System.out.println("Type the value of the height of the rectangle, and press Enter:");
        height = scanner.nextDouble();

        area = new DecimalFormat("#.##").format(base * height);
        perimeter = new DecimalFormat("#.##").format((2 * base) + (2 * height));

        System.out.printf("The value of the area is: %s \n", area);
        System.out.printf("The value of the perimeter is: %s", perimeter);
    }
}
