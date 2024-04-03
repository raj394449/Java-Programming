import java.util.*;

public class OddEven {
    public static void main(String args[]) {
        int num;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
