public class TypeCasting {

    // Implicit Type Casting
    void implicitTypeCasting() {
        int myInt = 10;
        double myDouble = myInt;
        System.out.println("Before Implicit Type Conversion : " + myInt);
        System.out.println("After Implicit Type Conversion : " + myDouble);
    }

    // Explicit Type Casting
    void explicitTypeCasting() {
        double numDouble = 3.42d;
        int numInt = (int) numDouble;
        System.out.println("Before Explicit Type Casting : " + numDouble);
        System.out.println("After Explicit Type Casting : " + numInt);
    }

    public static void main(String args[]) {
        // Creating a object for class

        TypeCasting obj = new TypeCasting();
        obj.implicitTypeCasting();
        obj.explicitTypeCasting();
    }
}
