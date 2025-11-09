
public class Task3 {
        public static void main(String[] args) {
            int sum;
            for (int i = 4; i <= 10000; i++){
                sum = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0)
                        sum += j;
                }
                if (i == sum)
                    System.out.printf("%d is the perfect number\n", i);
            }
        }
}
