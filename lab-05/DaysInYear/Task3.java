
public class Task3 {
    public static void main(String[] args) {
        
        System.out.println("Year\tDays");
        System.out.println("-----------------");
        for (int year = 2000; year <= 2020; year++)
            System.out.println(year + "\t" + numberOfDaysInAYear(year));
    }
    public static int numberOfDaysInAYear(int year) {
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeap)
            return 366;
        else
            return 365;
    }


}