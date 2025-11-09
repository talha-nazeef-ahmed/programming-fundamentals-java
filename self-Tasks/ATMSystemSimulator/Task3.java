import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int balance = 100000;
            int check = 0;
            boolean flag = true;
            System.out.println("Welcome to ABC ATM System");
            while (true){
                System.out.println("Enter your pin: ");
                int pin = input.nextInt();
                if (!pinVerification(pin)){
                    System.out.println("The pin entered is incorrect!");
                    check++;
                    if (check == 3){
                        System.out.println("Your card is blocked");
                        flag = false;
                        break;
                    }
                }
                else
                    break;
            }
            if (flag){
                while (true){
                    System.out.println("Enter 1: Check Balance\nEnter 2: Deposit money\nEnter 0: Exit");
                    int choice = input.nextInt();
                    if (choice == 0)
                        break;
                    else if (choice == 1)
                        checkBalance(balance);
                    else {
                        balance = depositMoney(balance);
                        System.out.printf("Your new balance is: %d", balance);
                    }
                }
            }
        }
        public static void checkBalance(int balance){
            System.out.printf("Your balance is %d", balance);
        }
        public static boolean pinVerification(int pin){
            int value = 1234;
            return (pin == value);
        }
        public static int depositMoney(int balance){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter amount to deposit: ");
            int amount = input.nextInt();
            balance = balance + amount;
            return balance;
        }
}
