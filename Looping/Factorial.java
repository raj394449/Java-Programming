package Looping;
import java.util.*;

public class Factorial {
    public static void main(String arg[]) {
        int num;
        int facto = 1;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            facto = facto * i;
        }
        System.out.println("Factorial of number is : " + facto);
    }
}
