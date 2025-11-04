import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = input.nextInt();
        System.out.println("Enter third integer: ");
        int num3 = input.nextInt();
        if (num1 == num2 && num3 == num2)
            System.out.println(3);
        else if ((num1 == num3 || num2 == num3 || num1 == num2) && (num1 != num2 || num1 != num3 || num2 != num3))
            System.out.println(2);
        else
            System.out.println(0);

    }
}