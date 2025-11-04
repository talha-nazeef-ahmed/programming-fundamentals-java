import java.util.*;
public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Class A tickets sold: ");
        int classA = input.nextInt();
        System.out.print("Enter number of Class B tickets sold: ");
        int classB = input.nextInt();
        System.out.print("Enter number of Class C tickets sold: ");
        int classC = input.nextInt();
        System.out.print("Enter number of Class D tickets sold: ");
        int classD = input.nextInt();
        int incomeA = classA * 20;
        int incomeB = classB * 15;
        int incomeC = classC * 10;
        int incomeD = classD * 5;
        int totalIncome = incomeA + incomeB + incomeC + incomeD;
        System.out.println("Income from Class A tickets: $" + incomeA);
        System.out.println("Income from Class B tickets: $" + incomeB);
        System.out.println("Income from Class C tickets: $" + incomeC);
        System.out.println("Income from Class D tickets: $" + incomeD);
        System.out.println("Total Income: $" + totalIncome);

    }
}