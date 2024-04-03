public class Variable {
    int instanceVariable = 45; // Instance Variable
    static int staticVariable = 78; // Static Variable

    void fun() {
        int a = 78; // Local Variable
        System.out.println("Static Variable :  " + staticVariable + "  Local Variable : " + a + " Instance Variable : "
                + instanceVariable);
        ++staticVariable;
        ++a;
    }

    public static void main(String args[]) {
        Variable obj = new Variable();
        obj.fun();
        System.out.println("Instance Variable is : " + obj.instanceVariable);
        obj.fun();
    }
}
