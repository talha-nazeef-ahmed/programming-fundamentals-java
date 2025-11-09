import java.util.*;
public class Task3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter two numbers and an operator (+, -, *, /) separated by space: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            char operation = input.next().charAt(0);
            if (operation != '+' && operation != '-' && operation != '*' && operation != '/')
                System.out.println("Invalid operator!");
            else
                switch (operation){
                    case '+':
                        System.out.printf("The result of addition is: %d", num1 + num2);
                        break;
                    case '-':
                        System.out.printf("The result of subtraction is: %d", num1 - num2);
                        break;
                    case '*':
                        System.out.printf("The result of multiplication is: %d", num1 * num2);
                        break;
                    case '/':
                        if (num2 == 0)
                            System.out.println("Division by zero is not allowed");
                        else
                            System.out.printf("The result of division is: %d", num1 / num2);
                }

        }
}
