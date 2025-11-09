import java.util.*;
public class Task1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of students: ");
            int numStd = input.nextInt();
            input.nextLine();
            int check = 0;
            String name = "";
            int highNum = 0;
            int secondHighNum = 0;
            String highName = "";
            String secondHigh = "";
            for (int i = 0; i < numStd; i++) {
                System.out.println("Enter the name of a student: ");
                name = input.nextLine();
                System.out.println("Enter their marks: ");
                check = input.nextInt();
                input.nextLine();
                if (check > highNum) {
                    secondHighNum = highNum;
                    secondHigh = highName;
                    highNum = check;
                    highName = name;
                } else if (check > secondHighNum) {
                    secondHighNum = check;
                    secondHigh = name;
                }
            }
            System.out.printf("%s has the highest marks\n%s has the second highest marks",
                    highName, secondHigh);
        }
}
