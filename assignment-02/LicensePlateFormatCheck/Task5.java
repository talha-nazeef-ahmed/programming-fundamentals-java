import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a vehicle plate number: ");
        String num = input.nextLine().trim();
        char character = '0';
        boolean flag = true;
        for (int i = 0; i < num.length() - 4; i++) {
            character = num.charAt(i);
            if (!Character.isUpperCase(character))
                flag = false;
        }
        for (int i = 3; i < num.length(); i++){
            character = num.charAt(i);
            if(!Character.isDigit(character))
                flag = false;
        }
        if (flag == true)
            System.out.println("The format of the number plate is correct!");
        else
            System.out.println("The format of the number plate is incorrect!");
    }
}