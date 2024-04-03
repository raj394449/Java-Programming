import java.util.*;

public class CompoundInterest {
    @SuppressWarnings("unused")
    public static void main(String args[]) {
        System.out.println("Compound Interest Calculator");
        int princepleAmount;
        int year;
        double rate;
        double interestAmount;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Princple Amount : ");
        princepleAmount = sc.nextInt();

        System.out.print("Enter number of year : ");
        year = sc.nextInt();

        System.out.print("Enter rate of interest : ");
        rate = sc.nextDouble();

        for (int i = 1; i <= year; i++) {
            interestAmount = princepleAmount * (1 + rate / 100);
            System.out.println("Compound Interest is : " + interestAmount);
            break;
        }

    }
}
