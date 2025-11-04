import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of milk produced: ");
        double milk = input.nextDouble();
        int cartonsNeeded = (int) (Math.round(milk/3.78));
        System.out.printf("No of cartons needed are %d\n", cartonsNeeded);
        double cost = milk * 0.38;
        System.out.printf("Cost of milk is $%f\n", cost);
        double profit = cartonsNeeded * 0.27;
        System.out.printf("Profit generated is $%f\n", profit);

    }
}