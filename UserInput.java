import java.util.Scanner;

public class UserInput {

    void IntegerInput() {
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Integer data : ");
        int a = obj.nextInt();
        System.out.println("Data is : " + a);
    }

    void StringInput() {
        @SuppressWarnings("resource")
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = obj1.nextLine();
        System.out.println("String are : " + str);
    }

    public static void main(String args[]) {

        UserInput user = new UserInput();
        user.IntegerInput();
        user.StringInput();

        // Scanner obj = new Scanner(System.in);

        // // Taking a Integer input from user
        // System.out.print("Enter First Data : ");
        // int a = obj.nextInt();

        // // Taking a String input from user
        // System.out.print("Enter Second Data : ");
        // int b = obj.nextLine();

        // System.out.println("A : " + a);
        // System.out.println("B : " + b);
    }
}
