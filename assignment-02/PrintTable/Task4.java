import java.util.Scanner;

public class Task4 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            int i = 1;
            while (true){
                if (i > 10)
                    break;
                System.out.printf("%d x %d = %d\n", num, i, num * i);
                i++;
            }
        }
}
