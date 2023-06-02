package dataTypesAndVariables;
import java.util.Scanner;
public class exercise05 {
    public static void main(String[] args) {
        int value, hundredBills, fifties, twenties, ten;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the value to withdraw, and press Enter:");
        value = scanner.nextInt();

        hundredBills = value / 100;
        fifties = value / 50;
        twenties =  value / 20;
        ten = value / 10;

        System.out.printf("The number of hundred bills needed to withdraw %d is: %d \n", value, hundredBills);
        System.out.printf("The number of fifties notes needed to withdraw %d is: %d \n", value, fifties);
        System.out.printf("The number of twenties notes needed to withdraw %d is: %d \n", value, twenties);
        System.out.printf("The number of notes of ten needed to withdraw %d is: %d", value, ten);
    }
}
