package String;

public class CompareString {

    static void literalString(){
        String str1 = "Lion";
        String str2 = "Lion";
        if(str1 == str2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }

    static void bothString(){
        String str = "Mohan";
        String str_new = new String("Mohan");
        if(str == str_new){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    static void methodString(){
        String a = "Tiger";
        String b = new String("Tiger");
        if(a.equals(b)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    public static void main(String args[]) {

        literalString();
        bothString();
        methodString();

    }
}
