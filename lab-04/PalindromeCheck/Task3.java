import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.next().toLowerCase();
        int length = word.length();
        String palindrome = "";
        char letter = '0';
        for (int i = 0; i < length; i++) {
            letter = word.charAt((length -1) - i);
            palindrome = palindrome + letter;
        }
        if (palindrome.equalsIgnoreCase(word))
            System.out.printf("%s is a palindrome", word);
        else
            System.out.printf("%s is not a palindrome", word);


    }
}