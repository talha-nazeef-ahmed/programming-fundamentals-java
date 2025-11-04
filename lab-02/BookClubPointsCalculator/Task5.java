import java.util.*;
public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What are the number of books you purchased this month: ");
        int books = input.nextInt();
        if (books == 0)
            System.out.println("You earned 0 points");
        else if (books == 1)
            System.out.println("You earned 5 points");
        else if (books == 2)
            System.out.println("You earned 15 points");
        else if (books == 3)
            System.out.println("You earned 30 points");
        else
            System.out.println("You earned 60 points");

    }
}