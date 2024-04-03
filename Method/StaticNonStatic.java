package Method;

public class StaticNonStatic {

    int num = 10; // Instance Variable
    static int num1 = 20; // Static Variable

    static void show() {
        System.out.println("Static Method - Static Variable : " + num1);
    }

    void disp() {
        System.out.println("Non-Static Method - " + "Instance Variable : " + num + ", Static Variable : " + num1);
    }

    public static void main(String args[]) {
        StaticNonStatic obj = new StaticNonStatic();
        show();
        obj.disp();
    }
}
