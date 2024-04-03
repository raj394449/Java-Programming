public class MultiplicationMethod {

    int mul(int a, int b) {
        int Mul = a * b;
        return Mul;
    }

    public static void main(String args[]) {
        MultiplicationMethod M = new MultiplicationMethod();
        System.out.println("Multiplication of Two number is : " + M.mul(8, 7));
    }
}
