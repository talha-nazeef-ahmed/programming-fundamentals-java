import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int temp = input.nextInt();
        String message;
        if (temp > 35)
            message = "Hot Day";
        else if (temp >= 25)
            message = "Pleasant Day";
        else if (temp >= 18)
            message = "Cool Day";
        else
            message = "Cold Day";
        System.out.printf("%-20s %-20s \n %-20d %-20s", "Temperature", "Message", temp, message);

    }
}