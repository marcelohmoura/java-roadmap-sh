package dataTypesAndVariables;
import java.util.Objects;
import java.util.Scanner;
public class exercise07 {
    public static void main(String[] args) {
        String word, reverseWord, result;
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder();

        System.out.println("Type a word, and press Enter:");
        word = scanner.nextLine();

        reverseWord = str.append(word).reverse().toString();
        result = Objects.equals(word, reverseWord) ? "is a palindrome" : "is not a palindrome";

        System.out.printf("The word '%s' %s", word, result);
    }
}
