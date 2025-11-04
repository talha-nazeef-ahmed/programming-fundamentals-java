import java.util.*;
public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int n, even = 0;
        while (true) {
            n = input.nextInt();
            if (n == 0)
                break;
            if (n % 2 == 0)
                even++;
        }
        System.out.printf("Output: %d", even);
    }
}