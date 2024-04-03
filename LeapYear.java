import java.util.*;

public class LeapYear {
    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year : ");
        int year = sc.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " is leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println(year + " is leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
    }
}
