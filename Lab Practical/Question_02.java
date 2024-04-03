/*
    Write a program to implement constructors in java. 
*/

public class Question_02 {
    private String name;
    private int age;

    // Default constructor
    public Question_02() {
        this.name = "XYZ";
        this.age = 20;
    }

    // Parameterized constructor
    public Question_02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Question_02 obj1 = new Question_02();
        Question_02 obj2 = new Question_02("John Doe", 30);
        // Displaying details of objects
        System.out.print("Details of default constructor (obj1): \n");
        obj1.displayDetails();
        System.out.print("\nDetails of Parameterized constructors (obj2) : \n");
        obj2.displayDetails();
    }
}
