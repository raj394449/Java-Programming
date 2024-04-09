package String;

public class BufferString {
    public static void main(String args[]){;
        StringBuffer ref = new StringBuffer("Hello ");
        ref.append("Java");
        System.out.println(ref);

        ref.reverse();
        System.out.println(ref);

        ref.insert(6,"World!");
        System.out.println(ref);
    }
}
