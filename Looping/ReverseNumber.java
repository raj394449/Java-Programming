package Looping;

public class ReverseNumber {

    void whileReverse() {
        int num = 10;
        while (num > 0) {
            System.out.print(num + " ");
            num--;
        }
    }

    void doWhileReverse() {
        int i = 10;
        do {
            System.out.print(i + " ");
            i--;
        } while (i > 0);
    }

    void forReverse() {
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String args[]) {
        ReverseNumber vars = new ReverseNumber();
        vars.whileReverse();
        System.out.println("\n-------------");
        vars.doWhileReverse();
        System.out.println("\n-------------");
        vars.forReverse();
    }
}
