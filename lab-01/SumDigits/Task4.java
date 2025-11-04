import java.util.*;
public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int digit1 = number % 10;
        int digit2 = (number / 10) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = (number / 1000) % 10;
        int sum = digit1 + digit2 + digit3 + digit4;
        System.out.println("The sum of the digits is " + sum);
    }
}