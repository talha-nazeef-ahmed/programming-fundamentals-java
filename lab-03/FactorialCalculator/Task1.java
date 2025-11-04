import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag = 1;
        System.out.println("give a number: ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            flag *= i;
        }
        System.out.printf("The factorial of %d is : %d", number, flag);

    }
}