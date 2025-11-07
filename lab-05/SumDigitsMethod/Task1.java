import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        long num = input.nextLong();
        System.out.printf("The sum of the digits is: %d", sumDigits(num));
    }
    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0){
            long lastDigit = n % 10;
            sum += (int) lastDigit;
            n /= 10;
        }
        return sum;
    }

}