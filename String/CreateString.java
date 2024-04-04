package String;

public class CreateString {

    static void literalString() {

        String name = "Sanjay";
        System.out.println(name);

        String sec_name = "Sanjay";
        System.out.println(sec_name);

        name.concat(" Kumar");
        System.out.println("Full Name : " + name);

        name = name.concat(" Kumar");
        System.out.println("Full Name : " + name);
    }

    static void newString() {

        String first_name = new String("Ram");
        System.out.println(first_name);

        String other_name = new String("Ram");
        System.out.println(other_name);

        first_name.concat(" Kumar");
        System.out.println("Full Name : " + first_name);

        first_name = first_name.concat(" Kumar");
        System.out.println(first_name);
    }

    public static void main(String args[]) {

        literalString();
        newString();
    }
}
