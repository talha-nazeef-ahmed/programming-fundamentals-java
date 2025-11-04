import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in decimal number: ");
        double number = input.nextDouble();
        int cent = (int) (number * 100);
        double dollar = (double) cent / 100;
        cent %= 100;
        double quarter = cent / 25;
        cent %= 25;
        double dimes = cent / 10;
        cent %= 10;
        double nickels = cent / 5;
        cent %= 5;
        double pennies = cent;
        System.out.printf("Dollars = %.1f\n",dollar);
        System.out.printf("Quarter = %.1f\n",quarter);
        System.out.printf("Dimes = %.1f\n", dimes);
        System.out.printf("Nickels = %.1f\n", nickels);
        System.out.printf("Pennies = %.1f\n", pennies);
    }
}