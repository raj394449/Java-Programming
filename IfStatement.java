import java.util.*;

public class IfStatement {
    public static void main(String arg[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num = sc.nextInt();
        if (num >= 0) {
            System.out.println("Number is Positive");
        }
    }
}