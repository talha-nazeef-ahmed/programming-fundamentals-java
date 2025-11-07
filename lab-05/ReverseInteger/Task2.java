import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        reverse(num);
    }
    public static void reverse(int number) {
        System.out.printf("The reverse of %d is: ", number);
        while (number > 0){
            int lastDigit = number % 10;
            System.out.print(lastDigit);
            number /= 10;
        }
    }

}