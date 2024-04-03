import myPackage.Utils;

public class Question_07 {
    public static void main(String[] args) {
        Greeting greeting = new Greeting("Sanjay");
        System.out.println(greeting.sayHello());
    }
}

class Greeting {
    private String name;

    public Greeting(String name) {
        this.name = name;
    }

    public String sayHello() {
        return Utils.greet(name);
    }
}
