package Method;

import java.util.*;

public class Recursion {

    public static void main(String args[]) {

        Factorial obj1 = new Factorial();

        int res = obj1.factorialNumber(5);
        System.out.println("Factorial of given number is : " + res);

        // Taking Input From User
        int res1 = obj1.inputData();
        System.out.println("Factorial of Number is : " + res1);
    }
}

class Factorial {

    int factorialNumber(int num) {
        if (num != 0) {
            return num * factorialNumber(num - 1);
        } else {
            return 1;
        }
    }

    int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    int inputData() {

        Factorial f = new Factorial();

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num1 = sc.nextInt();

        int result = f.factorial(num1);
        return result;
    }
}
