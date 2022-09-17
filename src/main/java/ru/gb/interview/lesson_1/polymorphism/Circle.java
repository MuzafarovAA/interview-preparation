package ru.gb.interview.lesson_1.polymorphism;

public class Circle extends Figure {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Drawing Circle");
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }

}
