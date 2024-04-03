package Looping;
import java.util.*;

public class TableOfNumber {
    public static void main(String args[]) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number : ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println((num) + " * " + (i) + " = " + (num * i));
        }
    }
}
