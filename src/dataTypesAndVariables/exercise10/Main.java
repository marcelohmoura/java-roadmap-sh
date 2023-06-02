package dataTypesAndVariables.exercise10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        int option = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("##### Phonebook #####");
            System.out.println("1. Add new contact");
            System.out.println("2. List all contacts");
            System.out.println("3. Search contact");
            System.out.println("0. Exit");
            System.out.println("######################");
            option = input.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("Type the contact name, and press Enter: ");
                    String name = input.next();
                    System.out.println("Type the contact phone number, and press Enter: ");
                    String phone = input.next();
                    System.out.println("Type the contact E-mail address, and press Enter: ");
                    String email = input.next();
                    phonebook.addContact(name, phone, email);
                    System.out.println("Contact added Successfully");
                }
                case 2 -> phonebook.getContacts();
                case 3 -> {
                    System.out.println("Type the contact name, and press Enter:");
                    String name = input.next();
                    phonebook.getContactByName(name);
                }
                default -> System.out.println("Invalid option, please type again");
            }
        } while (option != 0);
    }
}
