package dataTypesAndVariables.exercise10;
import java.util.ArrayList;
import java.util.Objects;

public class Phonebook {
    ArrayList<Contact> contacts = new ArrayList<Contact>();
    void addContact(String name, String phone, String email) {
        Contact contact = new Contact();
        contact.setName(name);
        contact.setPhone(phone);
        contact.setEmail(email);

        contacts.add(contact);
    }

    void contactInformationOutput(String name, String phone, String email) {
        System.out.printf("NAME: %s \n", name);
        System.out.printf("PHONE: %s \n", phone);
        System.out.printf("E-MAIL: %s \n", email);
    }
   void getContacts() {
       for (Contact contact : contacts) {
           String name = contact.getName();
           String phone = contact.getPhone();
           String email = contact.getEmail();
           contactInformationOutput(name, phone, email);
       }
   }
   void getContactByName(String name) {
        boolean isExistentContact = false;

       for (Contact contact : contacts) {
           String contactName = contact.getName();
           if (Objects.equals(name, contactName)) {
               isExistentContact = true;
               String phone = contact.getPhone();
               String email = contact.getEmail();
               contactInformationOutput(contactName, phone, email);
           }
       }
       if (!isExistentContact) {
           System.out.println("Contact not found");
       }
    }
}
