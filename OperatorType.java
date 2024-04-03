import java.util.*;

public class OperatorType {

    // Arithmetic Operator
    void arithmeticOperator() {
        int a = 10;
        int b = 5;
        System.out.println("Addition : " + (a + b));
        System.out.println("Subtraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division : " + (a / b));
        System.out.println("Modulus : " + (a % b));
    }

    // Unary Operator
    void unaryOperator() {
        int a1 = 10;
        System.out.println("Pre-Increment : " + (++a1));
        System.out.println("Post-Increment : " + (a1++));
        int a2 = 10;
        System.out.println("Pre-Decrement : " + (--a2));
        System.out.println("Post-Decrement : " + (a2--));
    }

    // Relational Operator
    void relationalOperator() {
        int a = 10;
        int b = 5;
        System.out.println("Equal to : " + (a == b));
        System.out.println("Not equal to : " + (a != b));
        System.out.println("Greater than or Equal to : " + (a >= b));
        System.out.println("Less than or Equal to : " + (b <= a));
        System.out.println("Greater than : " + (a > b));
        System.out.println("Less than : " + (b < a));
    }

    // Logical Operator
    void logicalOperator() {
        int a = 10;
        int b = 5;
        // Logical AND
        System.out.println("Logical AND 1st Condition : " + ((a > b) && (b < a)));
        System.out.println("Logical AND 2nd Condition : " + ((a > b) && (a == b)));
        System.out.println("Logical AND 3rd Condition : " + ((a == b) && (a > b)));
        System.out.println("Logical AND 4th Condition : " + ((a == b) && (a != b)));
        System.out.println("\n");

        // Logical OR
        System.out.println("Logical OR : " + ((a > b) || (b < a)));
        System.out.println("Logical OR : " + ((a > b) || (a == b)));
        System.out.println("Logical OR : " + ((a != b) || (a > b)));
        System.out.println("Logical OR : " + ((a == b) || (b > a)));
        System.out.println("\n");

        // Logical NOT
        System.out.println("Logical NOT : " + (!(a > b)));
        System.out.println("Logical NOT : " + (!(a < b)));
    }

    // Shift Operator
    void shiftOperator() {
        int x = 4;
        int y = x << 2;
        int z = x >> 2;
        System.out.println("Signed Left Shift Operator : " + y);
        System.out.println("Signed Right Shift Operator : " + z);
        System.out.println("Unsigned right shift operator : " + (-x >>> 2));
        System.out.println("Unsigned right shift operator : " + (x >>> 2));
    }

    // Bitwise Operator
    void bitwiseOperator() {

    }

    // Ternary Operator
    void ternaryOperator() {
        int a = 10;
        int b = 34;
        int max = (a > b) ? a : b;
        System.out.println("Greatest Number is : " + max);
    }

    // Assignment Operator
    void assignmentOperator() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        System.out.println("Value of a : " + a);
        System.out.println(a += 10);
    }

    public static void main(String args[]) {
        OperatorType obj = new OperatorType();
        // obj.arithmeticOperator();
        // obj.unaryOperator();
        // obj.relationalOperator();
        // obj.logicalOperator();
        // obj.shiftOperator();
        // obj.bitwiseOperator();
        // obj.ternaryOperator();
        obj.assignmentOperator();

    }
}