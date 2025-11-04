import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of 1st rectangle: ");
        int l1 = input.nextInt();
        System.out.println("What is the width of 1st rectangle: ");
        int w1 = input.nextInt();
        System.out.println("What is the length of 2nd rectangle: ");
        int l2 = input.nextInt();
        System.out.println("What is the width of 2nd rectangle: ");
        int w2 = input.nextInt();
        int r1 = l1 * w1;
        int r2 = l2 * w2;
        if (r1 > r2)
            System.out.println("The greater rectangle is rectangle 1");
        else if (r2 > r1)
            System.out.println("The greater rectangle is rectangle 2");
        else
            System.out.println("Both rectangles are equal");

    }
}