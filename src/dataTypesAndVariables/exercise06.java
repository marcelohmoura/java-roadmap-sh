package dataTypesAndVariables;
import java.util.Scanner;
public class exercise06 {
    public static void main(String[] args) {
        String phrase;
        Scanner scanner = new Scanner(System.in);
        String[] brokenWords;
        int numberOfWords;

        System.out.println("Type a phrase, and press Enter:");
        phrase = scanner.nextLine();

        brokenWords = phrase.split(" ");
        numberOfWords = brokenWords.length;

        System.out.printf("The number of words presents in the phrase is: %d", numberOfWords);
    }
}
