import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hours worked in week 1: ");
        double week1 = input.nextDouble();
        System.out.print("Enter hours worked in week 2: ");
        double week2 = input.nextDouble();
        System.out.print("Enter hours worked in week 3: ");
        double week3 = input.nextDouble();
        System.out.print("Enter hours worked in week 4: ");
        double week4 = input.nextDouble();
        System.out.print("Enter hours worked in week 5: ");
        double week5 = input.nextDouble();
        double totalHours = week1 + week2 + week3 + week4 + week5;
        double payRate = 15.50;
        double grossIncome = payRate * totalHours;
        double netIncome = grossIncome * (1 - 0.14);
        double clothes = netIncome * 0.10;
        double supplies = netIncome * 0.01;
        double remaining = netIncome - clothes - supplies;
        double bonds = remaining * 0.25;
        double parentsBonds = bonds * 0.50;
        System.out.printf("Income before taxes: $%.2f%n", grossIncome);
        System.out.printf("Income after taxes: $%.2f%n", netIncome);
        System.out.printf("Money spent on clothes: $%.2f%n", clothes);
        System.out.printf("Money spent on school supplies: $%.2f%n", supplies);
        System.out.printf("Money spent to buy savings bonds: $%.2f%n", bonds);
        System.out.printf("Money parents spent on savings bonds: $%.2f%n", parentsBonds);

    }
}