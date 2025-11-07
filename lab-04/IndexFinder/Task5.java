import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine().toLowerCase();
        int sIndex = word.indexOf('f');
        int lIndex = word.lastIndexOf('f');
        if (sIndex != -1 && lIndex != -1)
            System.out.printf("Correct answer: %d %d", sIndex, lIndex);

    }
}