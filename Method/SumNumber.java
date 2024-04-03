package Method;

class SumNumber {

    public int sumNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        SumNumber obj = new SumNumber();
        int sum;
        sum = obj.sumNumbers(8, 9);
        System.out.println("Sum of Numbers : " + sum);
    }
}
