import java.util.*;
public class Task4 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your salary: ");
            int salary = input.nextInt();
            if (salary >= 30000) {
                int deduction = (int) (salary * 0.08);
                int fSalary = salary - deduction;
                System.out.printf("Your final salary is %d", fSalary);
            }
            else if (salary >= 15000) {
                int deduction = 1000;
                int fSalary = salary - deduction;
                System.out.printf("Your final salary is %d", fSalary);
            }
            else
                System.out.printf("Your salary is %d", salary);
        }
}
