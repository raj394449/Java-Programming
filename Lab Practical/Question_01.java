/*  Write a program to accept a number as an input and find out 
    whether number is prime or not. 
*/

import java.util.*;

public class Question_01 {
    public static void main(String args[]) {
        int num;
        int count = 0;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Number : ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not a Prime");
        }
    }
}
