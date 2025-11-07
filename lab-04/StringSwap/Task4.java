import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        int space = sentence.indexOf(" ");
        String word1 = sentence.substring(0, space);
        String word2 = sentence.substring(space);
        System.out.printf("Correct answer: %s %s", word2, word1);

    }
}