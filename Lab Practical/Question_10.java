// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Class that uses exception handling
class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120.");
        }
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120.");
        }
        this.age = age;
    }
}

public class Question_10 {
    public static void main(String[] args) {
        try {
            // Attempt to create a person with an invalid age
            Person person1 = new Person("John Doe", -5);
            person1.displayInfo();
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        try {
            // Create a person with a valid age
            Person person2 = new Person("Jane Doe", 30);
            person2.displayInfo();

            // Attempt to set an invalid age
            person2.setAge(150);
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
