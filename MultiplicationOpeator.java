public class MultiplicationOpeator {

    int mul(int a, int b) {
        int Mul = a * b;
        return Mul;
    }

    public static void main(String args[]) {
        MultiplicationOpeator M = new MultiplicationOpeator();
        System.out.println("Multiplication of Two number is : " + M.mul(8, 7));
    }
}
