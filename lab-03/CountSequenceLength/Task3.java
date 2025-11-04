import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int s = 0, n;
        while (true) {
            n = input.nextInt();
            if (n == 0)
                break;
            else
                s++;
        }
        System.out.printf("Output: %d", s);
    }
}