import java.util.*;

public class Calculator {
    public static void main(String arg[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter Operator : ");
        char Op = sc.next().charAt(0);

        switch (Op) {
            case '+':
                System.out.println("Addition of Number is : "+(num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction of Number is : "+(num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication of Number is : "+(num1 * num2));
                break;
            case '/':
                System.out.println("Division of Number is : "+(num1 / num2));
                break;
            case '%':
                System.out.println("Remainder is : "+(num1 % num2));
                break;
            default:
                System.out.println("Enter Valid Operator");
                break;
        }
    }
}
