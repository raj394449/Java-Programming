/*
 Write a program to implement the concept of interfaces in java. 
*/

// Defining an interface
interface Animal {
    void eat();

    void sleep();
}

// Implementing the interface
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}

// Main class to test the interfaces
public class Question_06 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Calling methods through interfaces
        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();
    }
}
