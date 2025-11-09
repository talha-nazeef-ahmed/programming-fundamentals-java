import java.util.*;
public class Task2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter 0 for heads and 1 for tail: ");
            int userGuess = input.nextInt();
            int sysNum = (int) Math.round(Math.random());
            if (userGuess == sysNum)
                System.out.println("Your guess is right");
            else
                System.out.println("Your guess is wrong");
        }
}
