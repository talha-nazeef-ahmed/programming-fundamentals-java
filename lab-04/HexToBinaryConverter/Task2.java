import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit: ");
        char hex = Character.toUpperCase(input.next().charAt(0));
        int num = 0;
        int binary;
        String value = "";
        if (hex >= '0' && hex <= '9')
            num = hex - '0';
        else if (hex >= 'A' && hex <= 'F')
            num = hex - 'A' + 10;
        else
            System.out.println("Enter a valid hex digit");
        while (true) {
            binary = num % 2;
            value = binary + value;
            num /= 2;
            if (num <= 0)
                break;
        }
        System.out.printf("The binary value is %s", value);

    }
}