package Looping;

public class ReverseNumber {

    void whileReverse() {
        int num = 10;
        while (num > 0) {
            System.out.println(num + " ");
            num--;
        }
    }

    void doWhileReverse() {
        int i = 10;
        do {
            System.out.println(i + " ");
            i--;
        } while (i > 0);
    }

    void forReverse() {
        for (int i = 0; i < 10; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String args[]) {
        ReverseNumber vars = new ReverseNumber();
        vars.whileReverse();
        System.out.println("-------------");
        vars.doWhileReverse();
        System.out.println("-------------");
        vars.forReverse();
    }
}
