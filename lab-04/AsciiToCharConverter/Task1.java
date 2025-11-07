import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char letter = input.next().charAt(0);
        int code = (int) letter;
        System.out.printf("The unicode for the character %s is %d", letter, code);


    }
}