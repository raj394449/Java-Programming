class AdditionFunction {
    
    void Sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String args[]) {
        AdditionFunction Obj = new AdditionFunction();
        Obj.Sum(5, 9);

        // Instead of this we create a function that adds two number
        // int a = 12;
        // int b = 32;
        // int sum = a + b;
        // System.out.println("The Sum of : " + sum);
    }
}