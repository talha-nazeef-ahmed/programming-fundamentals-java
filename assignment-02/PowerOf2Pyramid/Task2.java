
public class Task2 {
        public static void main(String[] args) {
            int num = 8;
            for (int i = 1; i <= num; i++) {
                int multiple = 1;
                for (int j = i; j < num; j++)
                    System.out.print("    ");
                for (int j = 1; j <= i; j++) {
                    System.out.print(multiple + "   ");
                    multiple *= 2;
                }
                multiple /= 4;
                for (int j = 2; j<= i; j++) {
                    System.out.print(multiple + "   ");
                    multiple /= 2;
                }
                System.out.println();
            }
        }
}
