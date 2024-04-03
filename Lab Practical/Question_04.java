/*
    Write a program to elaborate the concept of multilevel 
    inheritance in java. 
*/

class GrandFather {
    void grandFather() {
        System.out.println("Grand Father Class");
    }
}

class Father extends GrandFather {
    void father() {
        System.out.println("Father Class");
    }
}

class Child extends Father {
    void child() {
        System.out.println("Child Class");
    }
}

public class Question_04 {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println("Accessing all class in Main Class");
        obj.child();
        obj.father();
        obj.grandFather();
    }
}
