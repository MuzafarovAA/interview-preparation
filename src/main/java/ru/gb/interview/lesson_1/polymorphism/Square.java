package ru.gb.interview.lesson_1.polymorphism;

public class Square extends Figure {

    private final double sideA;
    private final double sideB;

    public Square(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void drawFigure() {
        System.out.println("Drawing Square");
    }

    @Override
    public double getPerimeter() {
        return (2 * (sideA + sideB));
    }

}
