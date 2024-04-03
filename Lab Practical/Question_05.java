/*
    Write a program to find out area of rectangle, circle and 
    triangle using method overriding. 
*/

import java.lang.Math;

class Shape {
    // Method to calculate area (to be overridden by subclasses)
    public double calculateArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Question_05 {
    public static void main(String[] args) {
        // Creating instances of different shapes
        Rectangle rectangle = new Rectangle(6, 8);
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(4, 8);

        // Calculating and printing areas
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
