package Looping;

import java.util.*;

public class SumNaturalNumber {

    int sumOfNumber() {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= num) {
            sum = sum + i;
            i++;
        }
        return sum;
    }

    public static void main(String args[]) {

        SumNaturalNumber obj = new SumNaturalNumber();
        int res = obj.sumOfNumber();
        System.out.println("Sum of N natural number is : " + res);
    }
}
