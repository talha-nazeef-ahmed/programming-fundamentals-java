import java.util.*;
public class Task2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String mainStr = input.next().toLowerCase();
            String subStr = "";
            boolean flag = true;
            int length = mainStr.length();
            for (int i = 0; i < length - 2; i++) {
                subStr = mainStr.substring(i, i + 3);
                if (isPalindrome(subStr)) {
                    System.out.println("Palindrome exists");
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("Palindrome does not exist");

        }
        public static boolean isPalindrome(String str){
            int length = str.length();
            String flag = "";
            for (int i = length - 1; i >= 0; i--)
                flag = flag + str.charAt(i);
            return str.equals(flag);
        }
}
