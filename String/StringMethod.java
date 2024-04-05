package String;

public class StringMethod {

    static void toUpperLower() {
        String a = "Ram";
        String b = "RAM";
        System.out.println(a.toUpperCase());
        System.out.println(b.toLowerCase());
    }

    static void lengthMethod() {
        String x = "String are immutable in Java";
        System.out.println(x.length());
    }

    static void trimMethod() {
        String str = "      This is Trim Method         ";
        System.out.println(str);
        System.out.println(str.trim());
    }

    static void charAtMethod() {
        String str = "This is charAt Method";
        System.out.println(str.charAt(7));
    }

    static void indexOfMethod() {
        String name = "Sanjay Kumar";
        System.out.println(name.indexOf("K"));
        // System.out.println("Sub String 'Kumar' Index : "+name.indexOf("Kumar"));
    }

    static void concatMethod() {
        String p = "Hello";
        String q = " World!";
        System.out.println(p.concat(q));
        System.out.println(p.concat(" Sanjay"));
    }

    static void compareToMethod() {
        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = "Hello world";
        String demo = "";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareTo(demo));
    }

    static void equalsMethod() {
        String str = "Hello World";
        String new_str = new String("Hello World");
        System.out.println(str.equals(new_str));
    }

    static void isEmptyMethod() {
        String str = "";
        String new_str = new String("Hello World");
        System.out.println(str.isEmpty());
        System.out.println(new_str.isEmpty());

    }

    static void replaceMethod() {
        String str = "Hello World!";
        System.out.println(str.replace("H", "F"));
        System.out.println(str.replace("Hello", "The"));
    }

    static void replaceAllMethod() {
        String str = "Hello World!";
        System.out.println(str.replaceAll("World!", "Sanjay"));
    }

    public static void main(String args[]) {
        // toUpperLower();
        // lengthMethod();
        // trimMethod();
        // charAtMethod();
        // indexOfMethod();
        // concatMethod();
        // compareToMethod();
        // equalsMethod();
        // isEmptyMethod();
        // replaceMethod();
        // replaceAllMethod();
    }
}
