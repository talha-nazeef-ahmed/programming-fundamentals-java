import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int n = input.nextInt();
        int s = 0, num;
        for (int i = 0; i < n; i++ ) {
            num = input.nextInt();
            if (num == 0)
                s++;
        }
        System.out.printf("Output: %d", s);
    }
}