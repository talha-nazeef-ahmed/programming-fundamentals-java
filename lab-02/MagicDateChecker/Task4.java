import java.util.*;
public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year in 2 digits: ");
        int year = input.nextInt();
        System.out.println("Enter the month: ");
        int month = input.nextInt();
        System.out.println("Enter the date: ");
        int date = input.nextInt();
        if (date * month == year)
            System.out.println("The date is magic");
        else
            System.out.println("The date is not magic");
    }
}