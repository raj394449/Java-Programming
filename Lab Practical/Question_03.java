/*
    Write a program to find out area of rectangle, circle and 
    triangle using method overloading.
*/

import java.lang.Math;

class AreaCalculator {
    // Method to calculate area of rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate area of circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of triangle
    public double calculateArea(float base, float height) {
        return 0.5 * base * height;
    }
}

public class Question_03 {
    public static void main(String[] args) {
        // Creating an instance of AreaCalculator
        AreaCalculator calculator = new AreaCalculator();
        // Calculating and printing areas
        System.out.println("Area of Rectangle: " + calculator.calculateArea(5, 10));
        System.out.println("Area of Circle: " + calculator.calculateArea(7));
        System.out.println("Area of Triangle: " + calculator.calculateArea(4, 6));
    }
}
